package org.example.models;

import jakarta.persistence.*;

import java.time.ZonedDateTime;

@Entity
@Table(name = "PullRequest")
public class PullRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "repo", nullable = false)
    private String repo;
    @Column(name = "base", nullable = false)
    private String base;
    @Column(name = "number", nullable = false)
    private int number;
    @Column(name = "author_id", nullable = false)
    private int author_id;
    @Column(name = "author", nullable = false)
    private String author;
    @Column(name = "created_at", nullable = false)
    private ZonedDateTime created_at;
    @Column(name = "updated_at", nullable = false)
    private ZonedDateTime updated_at;
    @Column(name = "closed_at")
    private ZonedDateTime closed_at;
    @Column(name = "merged_at")
    private ZonedDateTime merged_at;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "body")
    private String body;
    @Column(name = "review_comments_url")
    private String review_comments_url;
    @Column(name = "commits_url")
    private String commits_url;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "state", nullable = false, length = 50)
    private String state;

    public PullRequest(){}

    public PullRequest(String repo, String base, int number,
                       int author_id, String author,
                       ZonedDateTime created_at, ZonedDateTime updated_at,
                       ZonedDateTime closed_at, ZonedDateTime merged_at,
                       String title, String body, String review_comments_url,
                       String commits_url, String description, String state) {
        this.repo = repo;
        this.base = base;
        this.number = number;
        this.author_id = author_id;
        this.author = author;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.closed_at = closed_at;
        this.merged_at = merged_at;
        this.title = title;
        this.body = body;
        this.review_comments_url = review_comments_url;
        this.commits_url = commits_url;
        this.description = description;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public String getRepo() {
        return repo;
    }

    public String getBase() {
        return base;
    }

    public int getNumber() {
        return number;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public String getAuthor() {
        return author;
    }

    public ZonedDateTime getCreated_at() {
        return created_at;
    }

    public ZonedDateTime getUpdated_at() {
        return updated_at;
    }

    public ZonedDateTime getClosed_at() {
        return closed_at;
    }

    public ZonedDateTime getMerged_at() {
        return merged_at;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getReview_comments_url() {
        return review_comments_url;
    }

    public String getCommits_url() {
        return commits_url;
    }

    public String getDescription() {
        return description;
    }

    public String getState() {
        return state;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCreated_at(ZonedDateTime created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(ZonedDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public void setClosed_at(ZonedDateTime closed_at) {
        this.closed_at = closed_at;
    }

    public void setMerged_at(ZonedDateTime merged_at) {
        this.merged_at = merged_at;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setReview_comments_url(String review_comments_url) {
        this.review_comments_url = review_comments_url;
    }

    public void setCommits_url(String commits_url) {
        this.commits_url = commits_url;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "PullRequest{" +
                "id=" + id +
                ", repo='" + repo + '\'' +
                ", base='" + base + '\'' +
                ", number=" + number +
                ", author_id=" + author_id +
                ", author='" + author + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", closed_at=" + closed_at +
                ", merged_at=" + merged_at +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", review_comments_url='" + review_comments_url + '\'' +
                ", commits_url='" + commits_url + '\'' +
                ", description='" + description + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
