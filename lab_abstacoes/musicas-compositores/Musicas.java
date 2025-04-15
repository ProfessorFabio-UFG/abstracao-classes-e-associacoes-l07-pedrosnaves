import java.util.ArrayList;

public class Musicas {
    private String nome;
    private int ano;
    private String tipo;
    private ArrayList<Compositores> compositores;

    public Musicas (String nome, int ano, String tipo){
        this.nome = nome;
        this.ano = ano;
        this.tipo = tipo;
        this.compositores = new ArrayList<>();
    }

    public void adicionarCompositor(Compositores c) {
        compositores.add(c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Título: ").append(nome)
          .append("\nAno: ").append(ano)
          .append("\nTipo: ").append(tipo)
          .append("\nCompositores:\n");
    
        for (Compositores c : compositores) {
            sb.append(c.toString()).append("\n");
        }
    
        return sb.toString();
    }
    
}
