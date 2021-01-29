package Controller;

import Dao.AlunoDao;
import Dao.ProfessorDao;
import Dao.UsuarioDao;
import Model.Aluno;
import Model.Professor;
import Model.Usuario;
import java.util.List;

public class UsuarioController {

    public static Usuario validaLogin(String login, String senha) {
        Usuario usuario = UsuarioDao.pesquisarPorLogin(login);

        if (usuario != null && usuario.getSenha().equals(senha)) {
            return usuario;
        } else {
            return null;
        }

    }

    public static boolean inserir(Usuario usuario) {

        if (UsuarioDao.inserir(usuario)) {

            if (usuario instanceof Aluno) {
                return AlunoDao.inserir((Aluno) usuario);
            } else if (usuario instanceof Professor) {
                return ProfessorDao.inserir((Professor) usuario);
            }

            return true;

        }

        return false;

    }

    public static Usuario pesquisar(int numero) {

        Usuario usuario = UsuarioDao.pesquisarPorNumero(numero);

        if (usuario != null) {

            if (usuario.getPerfil().equalsIgnoreCase("aluno")) {
                String curso = AlunoDao.pesquisar(numero).getCurso();
                return new Aluno(curso, usuario);
            } else if (usuario.getPerfil().equalsIgnoreCase("professor")) {
                String titulacao = ProfessorDao.pesquisar(numero).getTitulacao();
                return new Professor(titulacao, usuario);
            }

        }

        return usuario;

    }

    public static boolean remover(int numero) {
        return UsuarioDao.remover(numero);
    }

    public static boolean alterar(Usuario usuario) {

        if (UsuarioDao.alterar(usuario)) {

            if (usuario instanceof Aluno) {
                return AlunoDao.alterar((Aluno) usuario);
            } else if (usuario instanceof Professor) {
                return ProfessorDao.alterar((Professor) usuario);
            }

            return true;

        } else {
            return false;
        }

    }

    public static List<Usuario> listar() {
        List<Usuario> usuarios = UsuarioDao.listar();

        for (int i = 0; i < usuarios.size(); i++) {

            Usuario usuario = usuarios.get(i);

            if (usuarios.get(i).getPerfil().equalsIgnoreCase("aluno")) {
                String curso = AlunoDao.pesquisar(usuario.getNumero()).getCurso();
                usuarios.set(i, new Aluno(curso, usuario));
            } else if (usuarios.get(i).getPerfil().equalsIgnoreCase("professor")) {
                String titulacao = ProfessorDao.pesquisar(usuario.getNumero()).getTitulacao();
                usuarios.set(i, new Professor(titulacao, usuario));
            }

        }

        return usuarios;
    }

}
