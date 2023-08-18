package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("repo: 1,  issues: 2, pulls: 3");
        String choice = sc.next();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("owner, repo");
        String ownerName = sc2.next();
        String ownerRepo = sc2.next();
        GitHubApiClient ghac = new GitHubApiClient(ownerName, ownerRepo);
        if (choice.equals("1")) {
            System.out.println(ghac.getRepo());
        } else if (choice.equals("2")) {
            System.out.println(ghac.getRepoIssue());
        } else {
            System.out.println(ghac.getRepoPulls());
        }
        sc.close();
        sc2.close();
    }
}

