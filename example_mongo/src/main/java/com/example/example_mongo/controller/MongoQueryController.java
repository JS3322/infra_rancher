package com.example.example_mongo.controller;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.mongodb.core.MongoTemplate;

@RestController
@RequestMapping("/api/v1")
public class MongoQueryController {

    @Autowired
    private MongoTemplate mongoTemplate;

    //TODO [js] use mongo template and call mongodb data
    @GetMapping("/query")
    public String executeQuery() {
        MongoCollection<Document> collection = mongoTemplate.getCollection("TB_INDEX_TEST");

        // 예시: 모든 도큐먼트를 조회하는 쿼리
        FindIterable<Document> documents = collection.find();

        JSONArray jsonArray = new JSONArray();
        MongoCursor<Document> cursor = documents.iterator();
        while (cursor.hasNext()) {
            Document doc = cursor.next();
            jsonArray.put(doc.toJson());
        }

        return jsonArray.toString();
    }
}