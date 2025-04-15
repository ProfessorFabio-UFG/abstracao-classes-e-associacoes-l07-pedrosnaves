public class Enderecos {
    private String rua;
    private int numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private String estado;

    public Enderecos (String rua, int numero, String bairro, String complemento, String cidade, String estado){
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String toString() {
        return "Rua: " + this.rua + 
                "\nNumero: " + this.numero + 
                "\nBairro: " + this.bairro +
                "\nComplemento: " + this.complemento +
                "\nCidade: " + this.cidade +
                "\nEstado: " + this.estado;
    }
}
