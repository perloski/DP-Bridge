public class Parlante extends Dispositivo{

    //constructor
    Parlante(Conexion conexion, String nombre){
        super(conexion, nombre);
    }


    @Override
    public void escucharMusica(){
        System.out.println("Estas escuchando musica en el parlante "+getNombre()+ "\n");
    }
}
