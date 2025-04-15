public class GerenciarMusicas {
    public static void main(String[] args) {
        Compositores c1 = new Compositores("Chico Buarque", "Brasileiro");
        Compositores c2 = new Compositores("Tom Jobim", "Brasileiro");

        Musicas m1 = new Musicas("A banda", 1966, "MPB");
        m1.adicionarCompositor(c1);

        Musicas m2 = new Musicas("Garota de Ipanema", 1962, "Bossa Nova");
        m2.adicionarCompositor(c2);
        m2.adicionarCompositor(c1);

        System.out.println(m1);
        System.out.println("\n------------------------\n");
        System.out.println(m2);
    }
}
