public class GerenciarClientes {
    public static void main(String[] args) {
        Enderecos e1 = new Enderecos("17-A", 1461, "Setor Aeroporto", "ap 203", "Goiânia", "Goiás");
        Cliente cli1 = new Cliente("Pedro", "58968279115", e1);

        Enderecos e2 = new Enderecos("9", 98, "Setor Oeste", "ap 101", "Goiânia", "Goiás");
        Cliente cli2 = new Cliente("Ana Clara", "00258415748", e2);

        System.out.println(cli1);
        System.out.println(cli2);
    }
}
