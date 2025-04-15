public class Curso {
    private String nome;
    private String sigla;
    private Departamento departamento;

    public Curso (String nome, String sigla, Departamento departamento) {
        this.nome = nome;
        this.sigla = sigla;
        this.departamento = departamento;
    }

    public String toString() {
        return "Curso: " + this.nome + 
                ", Sigla: " + this.sigla + 
                "\n" + departamento.toString();
    }
}
