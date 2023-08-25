package org.example.Dao;

import org.example.models.PullRequest;

public interface PullRequestDao {
    void savePullReq(PullRequest pullRequest);
    void updatePullReq(PullRequest pullRequest);
    void deletePullReq(PullRequest pullRequest);
    String readPullReq(int primaryKey);
}
