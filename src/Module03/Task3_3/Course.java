package Module3.Task3_3;

import java.util.Date;

class Course {
    private String name, teacherName;
    private int hoursDuration;
    private Date startDate;

    public Course(int hoursDuration, Date dates) {
        this.hoursDuration = hoursDuration;
        this.startDate = dates;
    }

    Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    Course(String name, int hoursDuration, String teacherName) {
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        Date date = new Date();
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
