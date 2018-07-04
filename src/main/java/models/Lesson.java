package models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name ="lesson")
public class Lesson {

    private int id;
    private String title;
    private int classroomNumber;
    private String date;
    List<Lesson> lessons;


    public Lesson(){
        }

        public Lesson(String title, int classroomNumber, String date){
        this.title = title;
        this.classroomNumber = classroomNumber;
        this.date = date;
        }

    public int getId() {
        return id;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getClassroomNumber() {
        return classroomNumber;
    }

    public void setClassroomNumber(int classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
