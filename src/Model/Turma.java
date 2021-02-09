package Model;

public class Turma {

    private int id;
    private int semestre;
    private int ano;
    private int numProfessor;
    private int codDisciplina;
    private boolean ativa;

    public Turma() {
    }

    public Turma(int id, int semestre, int ano) {
        this.id = id;
        this.semestre = semestre;
        this.ano = ano;
    }

    public Turma(int id, int semestre, int ano, boolean ativa, int numProfessor, int codDisciplina) {
        this.id = id;
        this.semestre = semestre;
        this.ano = ano;
        this.numProfessor = numProfessor;
        this.codDisciplina = codDisciplina;
        this.ativa = ativa;
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

    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public String toString() {
        return "Turma{" + "id=" + id + ", semestre=" + semestre + ", ano=" + ano + ", numProfessor=" + numProfessor + ", codDisciplina=" + codDisciplina + ", ativa=" + ativa + '}';
    }

}
