public class Herança {
    public static void main (string[] args) {
        Animal a = new Animal();
        a.emitirSom();

        Cachorro c = new Cachorro();
        c.raça = "Americanbully";
        c.peso = "60.0f";
        c.nome = "Bob";

        c.emitirSom();
        System.out.printl("Nome do cachorro: " + c.nome + " - " + c.raça + " - " + c.peso + " - " + "kg");

        Gato g = new Gato();
        g.raça = "Siamês";
    g.peso = "40.0f"; 
    g.nome = "Ricardo";

    g.emitirSom();
    System.out.println("Nome do gato: " + g.nome + " - " + g.raça + " - " + g.peso + " - " + "kg");

    Cavalo cav = new Cavalo();
    cav.raça = "Cavalo arabe";
    cav.peso = "450.0f";
    cav.nome = "humberto";

    cav.emitirSom();
    System.out.println("Nome do cavalo: " + cav.nome + " - " + cav.raça + " - " + cav.peso + "kg");

    Camelo Cam = new Camelo();
    cam.raça = "Tarqui";
    cam.peso = "";
    cam.nome = "Juninho";

    Tubarao t = new tubarao();
    t.raça = "Tubarao branco";
    t.peso = "800.0f";
    t.nome = "george";

    t.emitirSom();
    System.out.println("nome do tubarao + " + t.nome + " - " + t.raça + " - " + t.peso + "kg");

 }
}