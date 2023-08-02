package pd.project.universitydbmanagement.exception;

public class NosuchFacultyExistsException extends RuntimeException {
    private String message;
    public NosuchFacultyExistsException(){
    }
    public NosuchFacultyExistsException(String message){
        super(message);
        this.message=message;
    }
}
