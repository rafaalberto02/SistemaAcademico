package Model;

public class Filtro {

    private String disciplina;
    private int semestre;
    private int ano;

    public Filtro() {
    }

    public Filtro(String disciplina, int semestre, int ano) {
        this.disciplina = disciplina;
        this.semestre = semestre;
        this.ano = ano;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
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

}
