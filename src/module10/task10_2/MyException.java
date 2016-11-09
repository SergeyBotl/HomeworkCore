package module10.task10_2;

class MyException extends RuntimeException {
    private String e;

    MyException(String e) {
        this.e = e;
    }

    MyException() {
    }

    @Override
    public String toString() {
        return "MyException " +
                "'" + e + '\'';
    }
}
