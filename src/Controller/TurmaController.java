package Controller;

import Dao.TurmaDao;
import Model.Disciplina;
import Model.Filtro;
import Model.Turma;
import View.ManterTurmas.AbrirTurma.JanelaListarDisciplinasDisponiveis;
import View.ManterTurmas.AbrirTurma.JanelaListarProfessoresDisponiveis;
import View.ManterTurmas.AbrirTurma.JanelaSemestreAno;
import java.util.ArrayList;
import java.util.List;

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

    public static List<Turma> listar(Filtro filtro) {
        List<Turma> turmas = TurmaDao.listar();

        List<Disciplina> disciplinas = new ArrayList<>();

        if (!filtro.getDisciplina().isBlank()) {
            disciplinas = DisciplinaController.pesquisarPorNome(filtro.getDisciplina());

            for (int i = turmas.size() - 1; i >= 0; i--) {

                boolean contem = false;

                for (Disciplina disciplina : disciplinas) {
                    contem = false;
                    if (turmas.get(i).getcodDisciplina() == disciplina.getCodigo()) {
                        contem = true;
                        break;
                    }
                }

                if (!contem) {
                    turmas.remove(i);
                }
            }

        }

        System.out.println(disciplinas);

        for (int i = 0; i < turmas.size(); i++) {

            if (filtro.getSemestre() > 0 && turmas.get(i).getSemestre() != filtro.getSemestre()
                    || filtro.getAno() > 0 && turmas.get(i).getAno() != filtro.getAno()) {
                turmas.remove(turmas.get(i));
            }

        }

        return turmas;
    }

}
