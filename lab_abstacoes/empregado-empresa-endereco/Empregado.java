public class Empregado {
    private String nome;
    private int matricula;
    private Endereco2 endereco2;

    public Empregado (String nome, int matricula, Endereco2 endereco2){
        this.nome = nome;
        this.matricula = matricula;
        this.endereco2 = endereco2;
    }

    public String toString() {
        return "\nNome: " + this.nome + 
                "\nMatricula: " + this.matricula + 
                "\n" +
                "\nEndereço: \n" + endereco2.toString();
    }


}
