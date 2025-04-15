public class GerenciarAlunos {
    public static void main(String[] args) {
        Departamento d1 = new Departamento("Instituto de Informática", "INF");
        Departamento d2 = new Departamento("Instituto de Matemática", "IME");

        Curso c1 = new Curso("Ciências da Computação", "CI", d1);
        Curso c2 = new Curso("Matemática", "MT", d2);

        Alunos a1 = new Alunos("Beatriz", 202256897, 2022, c1);
        Alunos a2 = new Alunos("Marcelo", 2022000257, 2022, c1);
        Alunos a3 = new Alunos("Matheus", 2022174587, 2022, c2);

        System.out.println(a1);
        System.out.println("------------------");
        System.out.println(a2);
        System.out.println("------------------");
        System.out.println(a3);
    }
}
