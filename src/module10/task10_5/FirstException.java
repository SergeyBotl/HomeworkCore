package module10.task10_5;

class FirstException extends Throwable {
   private String message;

    FirstException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "FirstException " +
                "message='" + message + '\''
                ;
    }
}