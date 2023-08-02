package pd.project.universitydbmanagement.exception;

public class PersonAlreadyExistException extends RuntimeException{
    private String message;
    public PersonAlreadyExistException(){
    }
    public PersonAlreadyExistException(String message){
        super(message);
        this.message=message;
    }
}
