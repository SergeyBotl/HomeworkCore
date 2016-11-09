package Module7.Task7_5;

public class Result {
    String nameMetod = "milliseconds";
    long milliseconds;


    public Result(String nameMetod, long milliseconds) {
        this.nameMetod = nameMetod;
        this.milliseconds = milliseconds;

    }

    @Override
    public String toString() {
        return "Result{"
                + nameMetod + '\''
                + milliseconds
                + " milisecond" + '\'' +
                '}';
    }
}
