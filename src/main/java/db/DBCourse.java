package db;

import models.Course;
import models.Lesson;
import models.Student;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.sql.Struct;
import java.util.List;

public class DBCourse {

    private static Session session;

    public static List<Student> getStudentsOnCourse(Course course) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Student> student = null;
        try {
            Criteria cr = session.createCriteria(Student.class);
            cr.add(Restrictions.eq("course", course));
            student = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return student;
    }

}


