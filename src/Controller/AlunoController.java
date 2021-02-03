package Controller;

import Dao.AlunoDao;
import Model.Aluno;

public class AlunoController {

    public static Aluno pesquisar(int numero) {
        return AlunoDao.pesquisar(numero);
    }

}
