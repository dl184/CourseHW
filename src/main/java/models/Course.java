package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="course")
public class Course {

    private int id;
    private String title;
    private Level level;
    List<Student> students;
    List<Lesson> lessons;

    public Course() {
    }

        public Course(String title, Level level){
            this.title = title;
            this.level = level;
            }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
        }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
