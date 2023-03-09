package com.example.demo.model.mongoTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MongoTestRepositoryTest {
    @Autowired
    private MongoTestRepository repository;

    @Test
    public void test(){
        repository.save(new MongoTest("aaaaa"));
    }
}