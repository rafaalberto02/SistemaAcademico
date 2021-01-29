package Controller;

import Dao.ProfessorDao;
import Dao.UsuarioDao;
import Model.Professor;
import Model.Usuario;
import java.util.List;

public class ProfessorController {

    public static List<Professor> listar() {
        List<Professor> professores = ProfessorDao.listar();

        for (int i = 0; i < professores.size(); i++) {

            Professor professor = professores.get(i);
            Usuario usuario = UsuarioDao.pesquisarPorNumero(professor.getNumero());

            professor = new Professor(professor.getTitulacao(), usuario);

            professores.set(i, professor);
        }

        return professores;
    }

}
