package Model;

public class FiltroUsuario {

    private int numero;
    private String nome;
    private String perfil;

    public FiltroUsuario(int numero, String nome, String perfil) {
        this.numero = numero;
        this.nome = nome;
        this.perfil = perfil;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    
}
