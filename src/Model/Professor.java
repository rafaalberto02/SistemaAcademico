package Model;

public class Professor extends Usuario {

    private String titulacao;

    public Professor() {
    }

    public Professor(int numero, String titulacao) {
        super.setNumero(numero);
        this.titulacao = titulacao;
    }

    public Professor(String titulacao, int numero, String nome, String login, String senha) {
        super(numero, nome, login, senha, "professor");
        this.titulacao = titulacao;
    }

    public Professor(String titulacao, Usuario usuario) {
        super(usuario.getNumero(), usuario.getNome(), usuario.getLogin(), usuario.getSenha(), "professor");
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "Professor " + super.toString() + ", titulacao=" + titulacao + "]";
    }

}
