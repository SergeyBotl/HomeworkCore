package Module3.Task3_3;

class SpecialStudent extends CollegeStudent {
    private long selectKey;
    private String email;

    SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    SpecialStudent(String firstName, String lastName, int group) {

        super(firstName, lastName, group);
    }

    SpecialStudent(String firstName, String lastName, int group, Course[] coursesTaken, int age, String collegeName, int rating, long id, long selectKey, String email) {
        super(firstName, lastName, group, coursesTaken, age, collegeName, rating, id);
        this.selectKey = selectKey;
        this.email = email;
    }

    public long getSelectKey() {
        return selectKey;
    }

    public void setSelectKey(long selectKey) {
        this.selectKey = selectKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
