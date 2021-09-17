package CustomedExceptions;

public class OutOfPermissibleRange extends Exception{
    public OutOfPermissibleRange(String errorMessage){
        super(errorMessage);
    }
}
