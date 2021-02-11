package Controller;

import Dao.TurmaDao;
import Model.Disciplina;
import Model.FiltroTurmaDisciplina;
import Model.Turma;
import View.ManterTurmas.AbrirTurma.JanelaListarDisciplinasDisponiveis;
import View.ManterTurmas.AbrirTurma.JanelaListarProfessoresDisponiveis;
import View.ManterTurmas.AbrirTurma.JanelaSemestreAno;
import java.util.ArrayList;
import java.util.List;

public class TurmaController {

    public static boolean abrirTurma(Turma turma) {

        if (turma.getCodDisciplina() > 0) {

            if (turma.getNumProfessor() > 0) {

                if (turma.getId() > 0
                        || turma.getAno() > 0
                        || turma.getSemestre() > 0) {

                    turma.setAtiva(true);
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

    public static List<Turma> listar(FiltroTurmaDisciplina filtro) {
        List<Turma> turmas = TurmaDao.listar();

        List<Disciplina> disciplinas = new ArrayList<>();

        if (filtro.getNomeDisciplina() != null && !filtro.getNomeDisciplina().isBlank()) {
            disciplinas = DisciplinaController.pesquisarPorNome(filtro.getNomeDisciplina());
        }

        for (int i = turmas.size() - 1; i >= 0; i--) {
            boolean contem = false;

            if (!disciplinas.isEmpty()) {
                for (Disciplina disciplina : disciplinas) {
                    if (turmas.get(i).getCodDisciplina() == disciplina.getCodigo()) {
                        contem = true;
                        break;
                    }
                }
            }

            if (filtro.getSemestre() > 0 && turmas.get(i).getSemestre() != filtro.getSemestre()
                    || filtro.getAno() > 0 && turmas.get(i).getAno() != filtro.getAno()
                    || filtro.getIdTurma() > 0 && turmas.get(i).getId() != filtro.getIdTurma()
                    || filtro.getNumProfessor() > 0 && turmas.get(i).getNumProfessor() != filtro.getNumProfessor()
                    || !turmas.get(i).isAtiva()
                    || !disciplinas.isEmpty() && !contem) {
                turmas.remove(i);
            }
        }

        return turmas;
    }

    public static Turma pesquisar(int id) {
        return TurmaDao.pesquisar(id);
    }

    public static int quantidadeDeAlunos(int idTurma) {
        return TurmaDao.quantidadeDeAlunos(idTurma);
    }
}
