public class GerenciarEmpresa {
    public static void main(String[] args) {
        Endereco2 ed1 = new Endereco2("17-A", 1461, "Setor Aeroporto", "ap 203", "Goiânia", "Goiás");
        Endereco2 ed2 = new Endereco2("C-130", 150, "Jardim América", "Lotes 6-15", "Goiânia", "Goiás");
        Endereco2 ed3 = new Endereco2("9", 98, "Setor Oeste", "ap 101", "Goiânia", "Goiás");
        Endereco2 ed4 = new Endereco2("Fortaleza", 10, "Alto da Glória", "ap 1503", "Goiânia", "Goiás");


        Empresa emp1 = new Empresa("12.345.678/0001-95", "Ferragista GT9", ed2);

        Empregado emprg1 = new Empregado("Raul", 1111, ed1);
        Empregado emprg2 = new Empregado("Bruna", 2222, ed3);
        Empregado emprg3 = new Empregado("Alfredo", 3333, ed4);

        emp1.adicionaEmpregado(emprg1);
        emp1.adicionaEmpregado(emprg2);
        emp1.adicionaEmpregado(emprg3);

        System.out.println(emp1);
    }
}
