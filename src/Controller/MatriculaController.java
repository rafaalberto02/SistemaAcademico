package Controller;

import Dao.MatriculaDao;
import Model.Matricula;
import java.util.List;

public class MatriculaController {

    public static boolean inserir(Matricula matricula) {
        return MatriculaDao.inserir(matricula);
    }

    public static List<Matricula> pesquisar(int codDisciplina) {
        return MatriculaDao.pesquisarPorDisciplina(codDisciplina);
    }

    public static Matricula pesquisar(int numAluno, int codDisciplina) {
        return MatriculaDao.pesquisar(numAluno, codDisciplina);
    }

    public static boolean alterar(Matricula matricula) {
        return MatriculaDao.alterar(matricula);
    }

}
