package org.example.repoImpl;

import org.example.models.PullRequest;
import org.example.repository.PullRequestRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class PullRequestRepoImpl implements PullRequestRepository<PullRequest> {
    private Set<PullRequest> pullRequests = new HashSet<>();

    @Override
    public Optional<PullRequest> get(Long id) {
        return Optional.empty();
    }

    @Override
    public Set<PullRequest> get() {
        return null;
    }

    @Override
    public void add(PullRequest obj) {

    }

    @Override
    public void remove(PullRequest obj) {

    }
}
