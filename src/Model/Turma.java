package Model;

public class Turma {

    private int id;
    private int semestre;
    private int ano;
    private int numProfessor;
    private int codDisciplina;

    public Turma() {
    }

    public Turma(int id, int semestre, int ano) {
        this.id = id;
        this.semestre = semestre;
        this.ano = ano;
    }

    public Turma(int id, int semestre, int ano, int numProfessor, int codDisciplina) {
        this.id = id;
        this.semestre = semestre;
        this.ano = ano;
        this.numProfessor = numProfessor;
        this.codDisciplina = codDisciplina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumProfessor() {
        return numProfessor;
    }

    public void setNumProfessor(int numProfessor) {
        this.numProfessor = numProfessor;
    }

    public int getcodDisciplina() {
        return codDisciplina;
    }

    public void setcodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    @Override
    public String toString() {
        return "Turma [id=" + id + ", semestre=" + semestre + ", ano=" + ano + ", professor=" + numProfessor
                + ", codDisciplina=" + codDisciplina + "]";
    }

}
