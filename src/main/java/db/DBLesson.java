package db;

import models.Lesson;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBLesson {

    private static Session session;

    public static List<Lesson> findLessons(Lesson lesson) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Lesson> results = null;
        try {
            Criteria cr = session.createCriteria(Lesson.class);
            cr.add(Restrictions.eq("lesson", lesson));
            results = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

}
