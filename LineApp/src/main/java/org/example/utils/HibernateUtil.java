package org.example.utils;

import org.example.models.*;
import static java.lang.Boolean.TRUE;
import static org.hibernate.cfg.AvailableSettings.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateUtil {
    private static SessionFactory sessionFactory = null;
    static{
        sessionFactory = new Configuration()
                //add mapping class
                .addAnnotatedClass(PullRequest.class)
                //connect to database
                .setProperty(URL, "jdbc:postgresql://localhost:5432/{dbname}")
                .setProperty(USER, "postgres")
                .setProperty(PASS, "password")
                .setProperty(DRIVER, "org.postgresql.Driver")
                .setProperty(DIALECT, "org.hibernate.dialect.PostgreSQLDialect")
                //use agroal connection pool
                .setProperty("hibernate.agroal.maxSize", "20")
                .setProperty(HBM2DDL_AUTO, "update")
                //display SQL in console
                .setProperty(SHOW_SQL, TRUE.toString())
                .setProperty(FORMAT_SQL, TRUE.toString())
                .setProperty(HIGHLIGHT_SQL, TRUE.toString())
                .buildSessionFactory();
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
