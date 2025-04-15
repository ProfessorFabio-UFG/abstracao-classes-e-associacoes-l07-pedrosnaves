public class Alunos {
    private String nome;
    private int matricula;
    private int ano;
    private Curso curso;

    public Alunos (String nome, int matricula, int ano, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }

    public String toString (){
        return "\nAluno: " + this.nome + 
                "\nMatricula: " + this.matricula + 
                "\nAno: " + this.ano + 
                "\n" + curso.toString();
    }
}
