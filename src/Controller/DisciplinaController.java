package Controller;

import Dao.DisciplinaDao;
import Model.Disciplina;
import java.util.List;

public class DisciplinaController {

    public static boolean inserir(Disciplina disciplina) {
        return DisciplinaDao.inserir(disciplina);
    }

    public static Disciplina pesquisarPorCodigo(int codigo) {
        return DisciplinaDao.pesquisar(codigo);
    }

    public static List<Disciplina> pesquisarPorNome(String nome) {
        return DisciplinaDao.pesquisarPorNome(nome);
    }

    public static boolean alterar(Disciplina disciplina) {
        return DisciplinaDao.alterar(disciplina);
    }

    public static boolean remover(int numero) {
        return DisciplinaDao.remover(numero);
    }

    public static List<Disciplina> listar() {
        return DisciplinaDao.listar();
    }

}
