package Hospital;

public class NoPersonnelException extends Exception{

    public NoPersonnelException(String errorMessage){
        super(errorMessage);
    }
}
