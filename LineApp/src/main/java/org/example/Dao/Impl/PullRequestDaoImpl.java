package org.example.Dao.Impl;

import org.example.Dao.PullRequestDao;
import org.example.models.PullRequest;
import org.example.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PullRequestDaoImpl implements PullRequestDao {

    @Override
    public void savePullReq(PullRequest pullRequest) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(pullRequest);
        transaction.commit();
        session.close();
    }

    @Override
    public void updatePullReq(PullRequest pullRequest) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(pullRequest);
        transaction.commit();
        session.close();
    }

    @Override
    public void deletePullReq(PullRequest pullRequest) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(pullRequest);
        transaction.commit();
        session.close();
    }

    @Override
    public String readPullReq(int primaryKey) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        PullRequest pr = session.find(PullRequest.class, primaryKey);
        transaction.commit();
        session.close();
        return pr.toString();
    }
}
