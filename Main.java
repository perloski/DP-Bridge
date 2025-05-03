public class Main{
    public static void main(String[] args) {
        
        //Creamos un objeto de tipo Auriculares, que sea bluetooth
        Auriculares auricular1 = new Auriculares(new Bluetooth(), "JBL 510");
        auricular1.describir();
        auricular1.escucharMusica();
        

        Auriculares blancosDeCable = new Auriculares(new Cable(), "Blancos baratos");
        blancosDeCable.describir();
        blancosDeCable.escucharMusica();

        Parlante marleyChantMini = new Parlante (new Bluetooth(), "de la resi");
        marleyChantMini.describir();
        marleyChantMini.escucharMusica();


    }

}
