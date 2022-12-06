package com.example.springbootstarter.controller;

import com.example.springbootstarter.models.Courses;
import com.example.springbootstarter.models.Topics;
import com.example.springbootstarter.services.CoursesService;
import com.example.springbootstarter.services.TopicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/topics")
public class CouseController {

    @Autowired
    private CoursesService coursesService;
    
    @Autowired
    private TopicsService topicsService;


    // Get All
    @GetMapping("/{id}/courses")
    public List<Courses> getAllCoursesByTopic(@PathVariable String id){
        return coursesService.getAllCourses(id);
    }


    // Get One
    @PostMapping("/{topicId}/courses/{id}")
    public Optional<Courses> getCourse(@PathVariable String id){
        return coursesService.getCourse(id);
    }

    // Add Course
    @PostMapping("/{topicID}/courses")
    public void createCourse(@RequestBody Courses course, @PathVariable String topicID){
        Optional<Topics> topic = topicsService.getTopic(topicID);
        course.setTopics(topic.get());
        coursesService.createCourse(course);
    }

    // Update Course
    @PutMapping("/{topicID}/courses")
    public void updateCourse(@RequestBody Courses course){
        coursesService.updateCourse(course);
    }

    // Delete Course
    @DeleteMapping("/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String id){
        coursesService.deleteCourse(id);
    }

}
