package Model;

public class Matricula {

    private int numAluno;
    private int idturma;
    private int nota1;
    private int nota2;
    private int exame;
    private int faltas;
    private boolean aprovado;

    public Matricula() {
    }

    public Matricula(int numAluno, int idTurma) {
        this.numAluno = numAluno;
        this.idturma = idTurma;
    }

    public Matricula(int numAluno, int idTurma, int nota1, int nota2, int exame, int faltas, boolean aprovado) {
        this.numAluno = numAluno;
        this.idturma = idTurma;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.exame = exame;
        this.faltas = faltas;
        this.aprovado = aprovado;
    }

    public int getNumAluno() {
        return numAluno;
    }

    public void setNumAluno(int numAluno) {
        this.numAluno = numAluno;
    }

    public int getIdturma() {
        return idturma;
    }

    public void setIdturma(int idturma) {
        this.idturma = idturma;
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

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    @Override
    public String toString() {
        return "Matricula{" + "numAluno=" + numAluno + ", idturma=" + idturma + ", nota1=" + nota1 + ", nota2=" + nota2 + ", exame=" + exame + ", faltas=" + faltas + ", aprovado=" + aprovado + '}';
    }
}
