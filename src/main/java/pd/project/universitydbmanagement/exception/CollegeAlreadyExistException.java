package pd.project.universitydbmanagement.exception;

public class CollegeAlreadyExistException extends RuntimeException{
    private String message;
    public CollegeAlreadyExistException(){
    }
    public CollegeAlreadyExistException(String message){
        super(message);
        this.message=message;
    }
}
