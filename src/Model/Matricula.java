package Model;

public class Matricula {

    private Aluno aluno;
    private Disciplina disciplina;
    private int nota1;
    private int nota2;
    private int exame;
    private int faltas;

    public Matricula() {
    }

    public Matricula(Aluno aluno, Disciplina disciplina, int nota1, int nota2, int exame, int faltas) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.exame = exame;
        this.faltas = faltas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getExame() {
        return exame;
    }

    public void setExame(int exame) {
        this.exame = exame;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    @Override
    public String toString() {
        return "Matricula [aluno=" + aluno + ", disciplina=" + disciplina + ", nota1=" + nota1 + ", nota2=" + nota2
                + ", exame=" + exame + ", faltas=" + faltas + "]";
    }

}
