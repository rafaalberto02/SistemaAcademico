package Controller;

import Dao.TurmaDao;
import Model.Turma;
import View.ManterTurmas.AbrirTurma.JanelaListarDisciplinasDisponiveis;
import View.ManterTurmas.AbrirTurma.JanelaListarProfessoresDisponiveis;
import View.ManterTurmas.AbrirTurma.JanelaSemestreAno;

public class TurmaController {

    public static boolean abrirTurma(Turma turma) {

        if (turma.getcodDisciplina() > 0) {

            if (turma.getNumProfessor() > 0) {

                if (turma.getId() > 0
                        || turma.getAno() > 0
                        || turma.getSemestre() > 0) {

                    return TurmaDao.inserir(turma);
                    
                } else {
                    new JanelaSemestreAno(turma).setVisible(true);
                }

            } else {
                new JanelaListarProfessoresDisponiveis(turma).setVisible(true);
            }

        } else {
            new JanelaListarDisciplinasDisponiveis(turma).setVisible(true);
        }

        return false;
    }

}
