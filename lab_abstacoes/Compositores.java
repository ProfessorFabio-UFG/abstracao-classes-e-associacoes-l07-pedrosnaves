public class Compositores {
    private String nome;
    private String nacionalidade;

    public Compositores (String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String toString() {
        return "\nCompositor: " + this.nome + 
                "\nNacionalidade: " + this.nacionalidade;
    }
}
