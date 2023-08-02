package pd.project.universitydbmanagement.exception;

public class FacultyAlreadyExistException extends RuntimeException{
    private String message;
    public FacultyAlreadyExistException(){
    }
    public FacultyAlreadyExistException(String message){
        super(message);
        this.message=message;
    }
}
