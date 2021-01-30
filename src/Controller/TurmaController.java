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

        }

        for (int i = 0; i < turmas.size(); i++) {

            boolean contem = false;

            if (disciplinas.size() > 0) {
                for (Disciplina disciplina : disciplinas) {
                    if (disciplina.getCodigo() == turmas.get(i).getcodDisciplina()) {
                        contem = true;
                    }
                }
            } else {
                contem = true;
            }
            
            if (!contem
                    || filtro.getSemestre() > 0 && turmas.get(i).getSemestre() != filtro.getSemestre()
                    || filtro.getAno() > 0 && turmas.get(i).getAno() != filtro.getAno()) {
                turmas.remove(i);
            }

        }

        return turmas;
    }

}
