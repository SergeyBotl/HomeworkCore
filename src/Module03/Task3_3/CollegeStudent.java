package Module3.Task3_3;

class CollegeStudent extends Student {
    private String collegeName;
    private int rating;
    private long id;

    CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    CollegeStudent(String firstName, String lastName, int group, Course[] coursesTaken, int age, String collegeName, int rating, long id) {
        super(firstName, lastName, group, coursesTaken, age);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;

    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
