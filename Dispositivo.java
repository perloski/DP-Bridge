public abstract class Dispositivo {
    
    //un atributo de tipo conexion
    public Conexion conexion;
    private String nombre;

    //lo incluimos en el constructor
    Dispositivo (Conexion conexion, String nombre){
        this.conexion = conexion;
        setNombre(nombre);
    }

    //get y set para el nombre
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //un metodo para decir que el dispositivo esta conectado con cieto tipo de conexion
    //este apunta a la interfaz
    public void describir (){
        System.out.println("Este dispositivo está conectado con: ");
        conexion.tipoConexion();
    }


    //metodo abstracto para que lo implementen las subclases
    public abstract void escucharMusica();
}
