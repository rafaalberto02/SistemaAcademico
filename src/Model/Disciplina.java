package Model;

public class Disciplina {

    private int codigo;
    private String nome;
    private int credito;

    public Disciplina() {
    }

    public Disciplina(int codigo, String nome, int credito) {
        this.codigo = codigo;
        this.nome = nome;
        this.credito = credito;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Disciplina [codigo=" + codigo + ", nome=" + nome + ", credito=" + credito + "]";
    }

}
