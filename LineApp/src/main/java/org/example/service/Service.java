package org.example.service;

import org.example.Dao.Impl.PullRequestDaoImpl;
import org.example.Dao.PullRequestDao;
import org.example.models.PullRequest;

public class Service {
    private static PullRequestDao pullRequestDao = new PullRequestDaoImpl();

    public static void savePullReq(PullRequest pullRequest){
        pullRequestDao.savePullReq(pullRequest);
    }

    public static void updatePullReq(PullRequest pullRequest){
        pullRequestDao.updatePullReq(pullRequest);
    }
    public static void deletePullReq(PullRequest pullRequest){
        pullRequestDao.deletePullReq(pullRequest);
    }
    public static String readPullReq(int primaryKey){
        return pullRequestDao.readPullReq(primaryKey);
    }
}
