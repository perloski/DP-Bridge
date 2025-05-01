public class Auriculares extends Dispositivo{
    
    //constructor 
    Auriculares(Conexion conexion, String nombre){
        super(conexion, nombre);
    }



    @Override
    public void escucharMusica(){
        System.out.println("Estas escuchando musica en los auriculares "+getNombre()+"\n ");
    }
}
