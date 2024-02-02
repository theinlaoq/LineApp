package org.example;

import java.io.PrintWriter;

import org.apache.commons.cli.*;
import org.example.viewLayer.GitHubApiClient;

public class Main {
    private static final Option ARG_OWNER = new Option(
            "o",
            "owner",
            true,
            "Set owner name"
    );
    private static final Option ARG_REPO = new Option(
            "r",
            "repo",
            true,
            "Set repo name"
    );
    private static final Option ARG_KEY = new Option(
            "k",
            "key",
            true,
            "Set your api_key"
    );
    private static final Option ARG_TYPE = new Option(
            "t",
            "type",
            true,
            "Set the type of the request"
    );

    private static void help(Options options) {
        HelpFormatter hf = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("LineApp");
        hf.printUsage(pw, 100, "[options] owner repo key type");
        hf.printOptions(pw, 100, options, 2, 5);
        pw.close();
    }

    public static void main(String[] args) {
        CommandLineParser clp = new DefaultParser();
        Options options = new Options();
        options.addOption(ARG_OWNER);
        options.addOption(ARG_REPO);
        options.addOption(ARG_KEY);
        options.addOption(ARG_TYPE);
        try {
            CommandLine cl = clp.parse(options, args);
            String owner = null;
            String repo = null;
            String type = null;
            String key = null;
            try {
                owner = cl.getOptionValue("owner");
                repo = cl.getOptionValue("repo");
                type = cl.getOptionValue("type");
                key = cl.getOptionValue("key");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            //checks null references
            if (owner == null || owner.isEmpty() ||
                    repo == null || repo.isEmpty() ||
                    key == null || key.isEmpty()) {
                System.err.println("owner, repo and key MUST BE NOT EMPTY");
                help(options);
                System.exit(-1);
            }
            //type: issues request by default
            if (type == null) {
                type = "issues";
            }
            //call githubapiclient methods
            GitHubApiClient gitHubApiClient = new GitHubApiClient(owner, repo, key);
            if (type.equals("repo")) {
                System.out.println(gitHubApiClient.getRepo());
            } else if (type.equals("issues")) {
                System.out.println(gitHubApiClient.getRepoIssue());
            } else if (type.equals("pulls")) {
                System.out.println(gitHubApiClient.getRepoPulls());
            } else {
                System.out.println("choose type repo, issues, pulls");
                help(options);
                System.exit(-1);
            }
        } catch (ParseException e) {
            help(options);
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}