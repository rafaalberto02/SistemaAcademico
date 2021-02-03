package Model;

public class FiltroTurmaDisciplina {

    private String nomeDisciplina;
    private int semestre;
    private int ano;
    private int idTurma;

    public FiltroTurmaDisciplina() {
    }

    public FiltroTurmaDisciplina(String disciplina, int semestre, int ano) {
        this.nomeDisciplina = disciplina;
        this.semestre = semestre;
        this.ano = ano;
    }

    public FiltroTurmaDisciplina(String disciplina, int semestre, int ano, int turma) {
        this.nomeDisciplina = disciplina;
        this.semestre = semestre;
        this.ano = ano;
        this.idTurma = turma;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
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

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

}
