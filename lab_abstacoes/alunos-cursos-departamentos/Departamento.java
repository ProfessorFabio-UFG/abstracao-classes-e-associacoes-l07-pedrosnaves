public class Departamento {
    private String nome;
    private String sigla;

    public Departamento (String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String toString() {
        return "Departamento: " + this.nome + 
                ", Sigla: " + this.sigla;
    }
}
