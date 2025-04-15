public class Cliente {
    private String nome;
    private String cpf;
    private Enderecos endereco;

    public Cliente(String nome, String cpf, Enderecos endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco; 
    }

    public String toString() {
        return "\nNome: " + this.nome + 
                "\nCPF: " + this.cpf + 
                "\nEndereço: \n" + endereco.toString();
    }
}
