package org.example.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.example.GitHubApiClient;
import org.example.models.PullRequest;
import org.example.repoImplementation.PullRequestRepositoryImpl;
import org.example.utils.JsonParseUtil;


import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class GitHubService {
    private PullRequestRepositoryImpl repository = new PullRequestRepositoryImpl();
    private ObjectMapper objectMapper = JsonParseUtil.objectMapper;
    private PullRequest pullRequest;

    public boolean DbConnectPullRequest(GitHubApiClient gitHubApiClient){
       try{
           ArrayNode arrayNode = (ArrayNode) gitHubApiClient.getRepoPulls();

           for(JsonNode elNode : arrayNode){
               pullRequest = new PullRequest.PRBuilder()
                       .id(elNode.get("id").asLong())
                       .repo(elNode.get("head").get("repo").get("name").asText())
                       .base(elNode.get("base").get("label").asText())
                       .number(elNode.get("number").asInt())
                       .authorId(elNode.get("user").get("id").asInt())
                       .author(elNode.get("user").get("login").asText())
                       .createdAt(ZonedDateTime.parse(elNode.get("created_at").asText()))
                       .updatedAt(ZonedDateTime.parse(elNode.get("updated_at").asText()))
                       .closedAt((elNode.get("closed_at").asText().equals("null")) ? null :
                               ZonedDateTime.parse(elNode.get("closed_at").asText()))
                       .mergedAt((elNode.get("merged_at").asText().equals("null")) ? null :
                               ZonedDateTime.parse(elNode.get("merged_at").asText()))
                       .title(elNode.get("title").asText())
                       .body(elNode.get("body").asText())
                       .reviewCommentsUrl(elNode.get("review_comments_url").asText())
                       .commitsUrl(elNode.get("commits_url").asText())
                       .description(elNode.get("head").get("repo").get("description").asText())
                       .state(elNode.get("state").asText())
                       .build();
               repository.create(pullRequest);
           }
           return true;
       }catch (Exception e){
           e.printStackTrace();
           return false;
       }
    }
}
