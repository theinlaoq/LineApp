package org.example.repository;

import org.example.models.PullRequest;

import java.sql.SQLException;

public interface Repository {
    void create(PullRequest pullRequest) throws SQLException;
    void update(PullRequest pullRequest) throws SQLException;
    PullRequest read(long id) throws SQLException;
    void delete(PullRequest pullRequest) throws SQLException;
}
