package org.example.repository;

import org.example.models.Model;

import java.util.Optional;
import java.util.Set;

public interface PullRequestRepository<T extends Model>{
    Optional<T> get (Long id);
    Set<T> get();
    void add(T obj);
    void remove(T obj);
}
