package com.example.springbootstarter.services;

import com.example.springbootstarter.models.Topics;
import com.example.springbootstarter.repository.TopicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TopicsService{

    @Autowired
    private TopicsRepository topicsRepository;

    public List<Topics> getAllTopics(){
        List<Topics> topics = topicsRepository.findAll();
        return topics;
    }

    public Optional<Topics> getTopic(String id){
        Optional<Topics> topic = topicsRepository.findById(id);
        return topic;
    }

    public void createTopic(Topics topic){
        topicsRepository.save(topic);
    }

    public void updateTopic(Topics topic){
        topicsRepository.save(topic);
    }

    public void deleteTopic(String id){
        topicsRepository.deleteById(id);
    }

}
