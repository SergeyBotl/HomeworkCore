package module10.task10_5;

public class LastException extends Throwable {
   private String message;

    LastException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "LastException " +
                "message='" + message + '\''
                 ;
    }
}