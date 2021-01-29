package Model;

public class Aluno extends Usuario {

    private String curso;

    public Aluno() {
    }
    
    public Aluno(int numero, String curso) {
        super.setNumero(numero);
        this.curso = curso;
    }

    public Aluno(String curso, int numero, String nome, String login, String senha) {
        super(numero, nome, login, senha, "aluno");
        this.curso = curso;
    }

    public Aluno(String curso, Usuario usuario) {
        super(usuario.getNumero(), usuario.getNome(), usuario.getLogin(), usuario.getSenha(), "aluno");
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno" + super.toString() + ", curso=" + curso + "]";
    }

}
