package Controller;

import Dao.MatriculaDao;
import Exceptions.LimiteDeAlunosAtingido;
import Model.Matricula;
import java.util.List;

public class MatriculaController {

    public static boolean inserir(Matricula matricula) throws LimiteDeAlunosAtingido {

        if (TurmaController.podeInserirAluno(matricula.getIdturma())) {
            throw new LimiteDeAlunosAtingido();
        }

        return MatriculaDao.inserir(matricula);
    }

    public static List<Matricula> pesquisarPorTurma(int idTurma) {
        return MatriculaDao.pesquisarPorTurma(idTurma);
    }

    public static List<Matricula> pesquisarPorAluno(int numAluno) {
        return MatriculaDao.pesquisarPorAluno(numAluno);
    }

    public static Matricula pesquisar(int numAluno, int idTurma) {
        return MatriculaDao.pesquisar(numAluno, idTurma);
    }

    public static boolean alterar(Matricula matricula) {
        return MatriculaDao.alterar(matricula);
    }

    public static void calculaSituacaoAlunos(Matricula matricula, int creditoDisciplina) {
        if (matricula.mediaProvas() >= 6
                && matricula.calculaFrequencia(creditoDisciplina * 10) <= 25) {
            matricula.setAprovado(true);
        } else if (matricula.getExame() > 0
                && matricula.mediaProvasExame() >= 6) {
            matricula.setAprovado(true);
        } else if (matricula.mediaProvas() < 6 && matricula.mediaProvas() >= 4
                && matricula.calculaFrequencia(creditoDisciplina * 10) <= 25) {
            matricula.setExame(-1);
        } else {
            matricula.setAprovado(false);
        }

        alterar(matricula);
    }

}
