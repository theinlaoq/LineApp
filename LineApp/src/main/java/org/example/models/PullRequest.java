package org.example.models;

import com.fasterxml.jackson.databind.JsonNode;
import jakarta.persistence.*;

import java.io.Serial;
import java.time.ZonedDateTime;

@Entity
@Table(name = "PullRequest")
public class PullRequest extends Model{
    @Serial
    private static final long serialVersionUID = 3460490108006801863L;

    @Column(name = "repo", nullable = false)
    private String repo;
    @Column(name = "base", nullable = false)
    private String base;
    @Column(name = "number", nullable = false)
    private int number;
    @Column(name = "authorId", nullable = false)
    private int authorId;
    @Column(name = "author", nullable = false)
    private String author;
    @Column(name = "createdAt", nullable = false)
    private ZonedDateTime createdAt;
    @Column(name = "updatedAt", nullable = false)
    private ZonedDateTime updatedAt;
    @Column(name = "closedAt")
    private ZonedDateTime closedAt;
    @Column(name = "mergedAt")
    private ZonedDateTime mergedAt;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "body")
    private String body;
    @Column(name = "reviewCommentsUrl")
    private String reviewCommentsUrl;
    @Column(name = "commitsUrl")
    private String commitsUrl;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "state", nullable = false, length = 50)
    private String state;

    public PullRequest(){}

    public PullRequest(JsonNode node) {
        //- вспомогательный статический метод +-
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

    public int getAuthorId() {
        return authorId;
    }

    public String getAuthor() {
        return author;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    public ZonedDateTime getClosedAt() {
        return closedAt;
    }

    public ZonedDateTime getMergedAt() {
        return mergedAt;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getReviewCommentsUrl() {
        return reviewCommentsUrl;
    }

    public String getCommitsUrl() {
        return commitsUrl;
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

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setClosedAt(ZonedDateTime closedAt) {
        this.closedAt = closedAt;
    }

    public void setMergedAt(ZonedDateTime mergedAt) {
        this.mergedAt = mergedAt;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setReviewCommentsUrl(String reviewCommentsUrl) {
        this.reviewCommentsUrl = reviewCommentsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
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
                ", repo='" + repo + '\'' +
                ", base='" + base + '\'' +
                ", number=" + number +
                ", author_id=" + authorId +
                ", author='" + author + '\'' +
                ", created_at=" + createdAt +
                ", updated_at=" + updatedAt +
                ", closed_at=" + closedAt +
                ", merged_at=" + mergedAt +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", review_comments_url='" + reviewCommentsUrl + '\'' +
                ", commits_url='" + commitsUrl + '\'' +
                ", description='" + description + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}