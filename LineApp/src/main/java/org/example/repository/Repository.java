package org.example.repository;

import org.example.models.PullRequest;

public interface Repository {
    void create(PullRequest pullRequest);
    void update(PullRequest pullRequest);
    void read(PullRequest pullRequest);
    void delete(PullRequest pullRequest);
}
