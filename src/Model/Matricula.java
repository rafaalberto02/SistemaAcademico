package Model;

public class Matricula {

    private int numAluno;
    private int codDisciplina;
    private int nota1;
    private int nota2;
    private int exame;
    private int faltas;

    public Matricula() {
    }

    public Matricula(int numAluno, int codDisciplina) {
        this.numAluno = numAluno;
        this.codDisciplina = codDisciplina;
    }

    public Matricula(int numAluno, int codDisciplina, int nota1, int nota2, int exame, int faltas) {
        this.numAluno = numAluno;
        this.codDisciplina = codDisciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.exame = exame;
        this.faltas = faltas;
    }

    public int getNumAluno() {
        return numAluno;
    }

    public void setNumAluno(int numAluno) {
        this.numAluno = numAluno;
    }

    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
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
        return "Matricula [aluno=" + numAluno + ", disciplina=" + codDisciplina + ", nota1=" + nota1 + ", nota2=" + nota2
                + ", exame=" + exame + ", faltas=" + faltas + "]";
    }

}
