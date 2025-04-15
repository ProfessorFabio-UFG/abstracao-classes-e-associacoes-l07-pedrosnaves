import java.util.ArrayList;

public class Empresa {
    private String cnpj;
    private String razao;
    private ArrayList<Empregado> empregado;
    private Endereco2 endereco2;

    public Empresa (String cnpj, String razao, Endereco2 endereco2){
        this.cnpj = cnpj;
        this.razao = razao;
        this.endereco2 = endereco2;
        this.empregado = new ArrayList<>();
    }

    public void adicionaEmpregado(Empregado e){
        empregado.add(e);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCNPJ: ").append(cnpj)
        .append("\nRazão: ").append(razao)
          .append("\nEmpregados:\n");
    
        for (Empregado e : empregado) {
            sb.append(e.toString()).append("\n");
        }
    
        return sb.toString() + 
        "\nEndereço da empresa: \n" + endereco2.toString();
    }

}
