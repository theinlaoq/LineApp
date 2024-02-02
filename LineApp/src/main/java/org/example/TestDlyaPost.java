package org.example;

import org.example.models.PullRequest;
import org.example.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.time.ZonedDateTime;

public class TestDlyaPost {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        PullRequest pr = new PullRequest.PRBuilder()
                .repo("jskd")
                .base("sdfkl")
                .number(1)
                .authorId(2)
                .author("sdaf")
                .createdAt(ZonedDateTime.now())
                .updatedAt(ZonedDateTime.now())
                .closedAt(ZonedDateTime.now())
                .mergedAt(ZonedDateTime.now())
                .title("as")
                .body("aasggg")
                .reviewCommentsUrl("https://sobaka.com")
                .commitsUrl("https://e.ru")
                .description("nothing")
                .state("baza")
                .build();
        try {
            session.beginTransaction();
            session.save(pr);
            session.getTransaction().commit();
            System.out.println("good");
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("err");
        }finally {
            session.close();
        }

    }
}
