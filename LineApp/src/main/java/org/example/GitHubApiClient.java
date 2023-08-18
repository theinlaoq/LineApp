package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class GitHubApiClient {
    private String ownerName;
    private String ownerRepos;
    private HttpClient httpClient = HttpClient.newHttpClient();
    private final static String ISSUES = "/issues";
    private final static String PULLS = "/pulls";
    private final static String GITHUB_API_URL = "https://api.github.com/repos/";
    private final static String API_KEY = "{YOUR TOKEN}";

    public GitHubApiClient(String ownerName, String ownerRepos) {
        this.ownerName = ownerName;
        this.ownerRepos = ownerRepos;
    }

    public String getRepo() {
        String apiUrl = GITHUB_API_URL + ownerName + "/" + ownerRepos;
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .headers("Authorization", "Bearer " + API_KEY,
                        "Accept", "application/vnd.github.v3+json",
                        "X-GitHub-Api-Version", "2022-11-28")
                .timeout(Duration.of(20, ChronoUnit.SECONDS))
                .GET()
                .build();
        try {
            HttpResponse<String> response = httpClient.send(httpRequest,
                    HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getRepoIssue() {
        String apiUrl = GITHUB_API_URL + ownerName + "/" + ownerRepos + ISSUES;
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .headers("Authorization", "Bearer " + API_KEY,
                        "Accept", "application/vnd.github.v3+json",
                        "X-GitHub-Api-Version", "2022-11-28")
                .timeout(Duration.of(20, ChronoUnit.SECONDS))
                .GET()
                .build();
        try {
            HttpResponse<String> response = httpClient.send(httpRequest,
                    HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public String getRepoPulls() {
        String apiUrl = GITHUB_API_URL + ownerName + "/" + ownerRepos + PULLS;
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .headers("Authorization", "Bearer " + API_KEY,
                        "Accept", "application/vnd.github.v3+json",
                        "X-GitHub-Api-Version", "2022-11-28")
                .timeout(Duration.of(20, ChronoUnit.SECONDS))
                .GET()
                .build();
        try {
            HttpResponse<String> response = httpClient.send(httpRequest,
                    HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


