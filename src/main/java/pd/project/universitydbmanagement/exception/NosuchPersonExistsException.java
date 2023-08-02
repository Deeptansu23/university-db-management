package pd.project.universitydbmanagement.exception;

public class NosuchPersonExistsException extends RuntimeException {
    private String message;
    public NosuchPersonExistsException(){
    }
    public NosuchPersonExistsException(String message){
        super(message);
        this.message=message;
    }
}
