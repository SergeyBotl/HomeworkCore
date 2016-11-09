package module10.task10_5;

 class SecondException extends Throwable{
   private String message;

    SecondException(String message) {
        this.message = message;
    }

     @Override
     public String toString() {
         return "SecondException " +
                 "message='" + message + '\''  ;
     }
 }
