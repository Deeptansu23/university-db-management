package pd.project.universitydbmanagement.exception;

public class NosuchCollegeExistsException extends RuntimeException {
    private String message;
    public NosuchCollegeExistsException(){
    }
    public NosuchCollegeExistsException(String message){
        super(message);
        this.message=message;
    }
}
