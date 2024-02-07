package org.example.repoImplementation;

import org.example.models.PullRequest;
import org.example.repository.Repository;
import org.example.utils.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;

public class PullRequestRepositoryImpl implements Repository {

    @Override
    public void create(PullRequest pullRequest) throws SQLException {
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(pullRequest);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }

    }

    @Override
    public void update(PullRequest pullRequest) throws SQLException {
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(pullRequest);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
    }

    @Override
    public PullRequest read(long id) throws SQLException {
        Session session = null;
        PullRequest pullRequest = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            pullRequest = (PullRequest)session.load(PullRequest.class, id);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
        return pullRequest;
    }

    @Override
    public void delete(PullRequest pullRequest) throws SQLException {
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(pullRequest);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
    }
}
