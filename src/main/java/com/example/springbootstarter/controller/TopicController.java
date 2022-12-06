package com.example.springbootstarter.controller;

import com.example.springbootstarter.models.Topics;
import com.example.springbootstarter.repository.TopicsRepository;
import com.example.springbootstarter.services.TopicsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/topics")
public class TopicController{

    @Autowired
    private TopicsService topicsService;

    // Get All
    @GetMapping("/")
    public List<Topics> getAllTopics(){
        return topicsService.getAllTopics();
    }

    // Get One
    @GetMapping("/{id}")
    @ApiOperation(value = "Find Topics By ID",
            notes = "Provide an ID and get the specific Topic details",
            response = Topics.class)
    public Optional<Topics> getTopic(@PathVariable String id){
        return topicsService.getTopic(id);
    }

    // POST
    @PostMapping("/")
    public void createTopic(@RequestBody Topics topic){
        topicsService.createTopic(topic);
    }

    // Update
    @PutMapping("/{id}")
    public void updateTopic(@RequestBody Topics topic, @PathVariable String id){
        topicsService.updateTopic(topic);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteTopic(@PathVariable String id){
        topicsService.deleteTopic(id);
    }

}