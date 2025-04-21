package entities;

public class ClienteNotFoundException extends Exception  {

    public ClienteNotFoundException(String message ){
        super(message);
    }

    public ClienteNotFoundException(){
        super("Cliente no encontrado");
    }

}
