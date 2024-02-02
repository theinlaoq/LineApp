package org.example.models;

import jakarta.persistence.*;

import java.time.ZonedDateTime;

@Entity
@Table(name = "PullRequest")
public class PullRequest{

    @Column(name = "repo", nullable = false)
    private String repo;
    @Column(name = "base", nullable = false)
    private String base;
    @Column(name = "number", nullable = false)
    private int number;
    @Column(name = "author_id", nullable = false)
    private int authorId;
    @Column(name = "author", nullable = false)
    private String author;
    @Column(name = "created_at", nullable = false)
    private ZonedDateTime createdAt;
    @Column(name = "updated_at", nullable = false)
    private ZonedDateTime updatedAt;
    @Column(name = "closed_at")
    private ZonedDateTime closedAt;
    @Column(name = "merged_at")
    private ZonedDateTime mergedAt;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "body")
    private String body;
    @Column(name = "review_comments_url")
    private String reviewCommentsUrl;
    @Column(name = "commits_url")
    private String commitsUrl;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "state", nullable = false, length = 50)
    private String state;

    public PullRequest(){}

    private PullRequest(PRBuilder prBuilder){
        this.repo = prBuilder.repo;
        this.base = prBuilder.base;
        this.number = prBuilder.number;
        this.authorId = prBuilder.authorId;
        this.author = prBuilder.author;
        this.createdAt = prBuilder.createdAt;
        this.updatedAt = prBuilder.updatedAt;
        this.closedAt = prBuilder.closedAt;
        this.mergedAt = prBuilder.mergedAt;
        this.title = prBuilder.title;
        this.body = prBuilder.body;
        this.reviewCommentsUrl = prBuilder.reviewCommentsUrl;
        this.commitsUrl = prBuilder.commitsUrl;
        this.description = prBuilder.description;
        this.state = prBuilder.state;
    }

    public static class PRBuilder{
        private String repo;
        private String base;
        private int number;
        private int authorId;
        private String author;
        private ZonedDateTime createdAt;
        private ZonedDateTime updatedAt;
        private ZonedDateTime closedAt;
        private ZonedDateTime mergedAt;
        private String title;
        private String body;
        private String reviewCommentsUrl;
        private String commitsUrl;
        private String description;
        private String state;

        public PullRequest build(){
            return new PullRequest(this);
        }

        public PRBuilder repo(String repo){
            this.repo = repo;
            return this;
        }

        public PRBuilder base(String base){
            this.base = base;
            return this;
        }
        public PRBuilder number(int number){
            this.number = number;
            return this;
        }
        public PRBuilder authorId(int authorId){
            this.authorId = authorId;
            return this;
        }
        public PRBuilder author(String author){
            this.author = author;
            return this;
        }
        public PRBuilder createdAt(ZonedDateTime createdAt){
            this.createdAt = createdAt;
            return this;
        }
        public PRBuilder updatedAt(ZonedDateTime updatedAt){
            this.updatedAt = updatedAt;
            return this;
        }
        public PRBuilder closedAt(ZonedDateTime closedAt){
            this.closedAt = closedAt;
            return this;
        }
        public PRBuilder mergedAt(ZonedDateTime mergedAt){
            this.mergedAt = mergedAt;
            return this;
        }
        public PRBuilder title(String title){
            this.title = title;
            return this;
        }
        public PRBuilder body(String body){
            this.body = body;
            return this;
        }
        public PRBuilder reviewCommentsUrl(String reviewCommentsUrl){
            this.reviewCommentsUrl = reviewCommentsUrl;
            return this;
        }
        public PRBuilder commitsUrl(String commitsUrl){
            this.commitsUrl = commitsUrl;
            return this;
        }
        public PRBuilder description(String description){
            this.description = description;
            return this;
        }
        public PRBuilder state(String state){
            this.state = state;
            return this;
        }
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