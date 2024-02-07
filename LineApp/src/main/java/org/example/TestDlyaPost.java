package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.example.repository.Repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class TestDlyaPost {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        try{
            JsonNode rootNode = objectMapper.readTree(
                    Files.readAllBytes(Paths
                            .get("C:\\Users\\theinlao\\Desktop\\git\\LineApp\\LineApp\\src\\main\\java\\org\\example\\pulls.json"))

            );
            ArrayNode arrayNode = (ArrayNode) rootNode;
            for(JsonNode elNode : arrayNode){
               // System.out.println(elNode.get("created_at").asText());
                //System.out.println(elNode.get("title").asText());
                //System.out.println(elNode.get("body").asText());
                //System.out.println(elNode.get("commits_url").asText());
                System.out.println(elNode.get("number"));//author_assosiation
                //System.out.println(elNode.get("review_comments_url").asText());


            }
            //System.out.println(arrayNode);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("bad gate away :(");
        }
    }
}
