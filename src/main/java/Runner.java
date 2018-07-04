import db.DBCourse;
import db.DBHelper;
import db.DBLesson;
import models.Course;
import models.Lesson;
import models.Level;
import models.Student;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Course course1 = new Course("Computing", Level.BA);
        DBHelper.save(course1);
        Course course2 = new Course("Engineering", Level.BENG);
        DBHelper.save(course2);
        Course course3 = new Course("Literature", Level.MC);
        DBHelper.save(course3);

        Student student1 = new Student("Derek", "Leach", 34, 680, course1);
        DBHelper.save(student1);
        Student student2 = new Student("Adri", "Florence", 28, 758, course2);
        DBHelper.save(student2);
        Student student3 = new Student("Clerya", "Catsucurry", 28, 930, course3);
        DBHelper.save(student3);

        Lesson lesson1 = new Lesson("Advanced Software Development", 12, "22-08-2018");
        DBHelper.save(lesson1);
        Lesson lesson2 = new Lesson("Advanced Engineering", 14, "24/08/2018");
        DBHelper.save(lesson2);
        Lesson lesson3 = new Lesson("Advanced Literature", 15, "26/08/2018");
        DBHelper.save(lesson3);

        List<Student> foundStudents = DBCourse.getStudentsOnCourse(course3);
        List<Lesson> foundLessons = DBLesson.findLessons(lesson2);


    }
}
