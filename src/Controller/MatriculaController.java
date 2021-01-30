package Controller;

import Dao.MatriculaDao;
import Model.Matricula;

public class MatriculaController {

    public static boolean inserir(Matricula matricula) {
        return MatriculaDao.inserir(matricula);
    }

}
