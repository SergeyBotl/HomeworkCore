package Module3.Task3_3;

import java.util.Date;

public class Solution {

    public static void main(String[] args) {


        Course[] courses = new Course[3];
        courses[0] = new Course(new Date(20160811), "GoAndroid");
        courses[1] = new Course(new Date(20160811), "GoJava");
        courses[2] = new Course(new Date(20160811), "GoQa");

/*
        Course course1 = new Course(new Date(20160811), "GoAndroid");
        Course course2 = new Course(new Date(20160811), "GoJava");
        Course course3 = new Course(new Date(20160811), "GoQa");
        Course []courses= {course1,course2,course3};
*/
        Course courseGoAndroid = new Course("GoAndroid", 62, "Garik");
        Course courseGoJava = new Course("GoJava", 62, "Roma");
        Course courseGoQa = new Course("GoQa", 25, "Vasya");
        SpecialStudent courseBen = new SpecialStudent("Ben", courses);
        SpecialStudent courseDen = new SpecialStudent("Den", courses);
        SpecialStudent courseKen = new SpecialStudent("Ken", courses);
        SpecialStudent studentCourse2 = new SpecialStudent("Donev", "Den", 2);
        SpecialStudent studentCourse1 = new SpecialStudent("Konev", "Ben", 1);
        SpecialStudent studentCourse3 = new SpecialStudent("Bonev", "Ken", 3);
        SpecialStudent infoBen = new SpecialStudent("Ben", "Konev", 1, courses, 4, "Goit", 10, 445, 51555, "Ben@vdf.sdf");
        SpecialStudent infoDen = new SpecialStudent("Den", "Donev", 2, courses, 4, "Goit", 10, 446, 47893, "Den@vdf.sdf");
        SpecialStudent infoKen = new SpecialStudent("Ken", "Bonev", 3, courses, 4, "Goit", 10, 447, 03265, "Ken@vdf.sdf");


    }
}
