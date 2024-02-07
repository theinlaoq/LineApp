package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JacksonTest {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        try{
            JsonNode rootNode = objectMapper.readTree(
                    Files.readAllBytes(Paths
                            .get("C:\\Users\\Admin\\Desktop\\github\\LineApp\\LineApp\\src\\main\\java\\org\\example\\pulls.json"))

            );
            ArrayNode arrayNode = (ArrayNode) rootNode;
            for(JsonNode elNode : arrayNode){
                //System.out.println(elNode.get("id").asLong()); //field id
                //System.out.println(elNode.get("head").get("repo").get("name").asText());//field repo(cur name now)
                //System.out.println(elNode.get("base").get("label").asText());//field base(cur label now)
                //System.out.println(elNode.get("number").asInt());//field number
                //System.out.println(elNode.get("user").get("id").asInt());//field author_id
                //System.out.println(elNode.get("user").get("login").asText());//field author
                //System.out.println(elNode.get("created_at").asText());//field created at
                //System.out.println(elNode.get("updated_at").asText());//field updated_at
                //System.out.println(elNode.get("closed_at") == null);//field closed_at
                //System.out.println(elNode.get("merged_at").asText());//field merged_at
                //System.out.println(elNode.get("title").asText());//field title
                //System.out.println(elNode.get("body").asText());//field body
                //System.out.println(elNode.get("review_comments_url").asText());//field review_comments_url
                //System.out.println(elNode.get("commits_url").asText());//field commits_url

                System.out.println(elNode.get("head").get("repo").get("description").asText());//field description

                //System.out.println(elNode.get("state").asText());//field state



            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("bad gate away :(");
        }
    }
}