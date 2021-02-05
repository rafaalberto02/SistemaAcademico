package Controller;

import Dao.MatriculaDao;
import Exceptions.LimiteDeAlunosAtingido;
import Model.Matricula;
import java.util.List;

public class MatriculaController {

    public static boolean inserir(Matricula matricula) throws LimiteDeAlunosAtingido {

        if (TurmaController.quantidadeDeAlunos(matricula.getIdturma()) >= 50) {
            throw new LimiteDeAlunosAtingido();
        }

        return MatriculaDao.inserir(matricula);
    }

    public static List<Matricula> pesquisar(int idTurma) {
        return MatriculaDao.pesquisarPorTurma(idTurma);
    }

    public static Matricula pesquisar(int numAluno, int idTurma) {
        return MatriculaDao.pesquisar(numAluno, idTurma);
    }

    public static boolean alterar(Matricula matricula) {
        return MatriculaDao.alterar(matricula);
    }

}
