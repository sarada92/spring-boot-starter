package com.example.springbootstarter.services;

import com.example.springbootstarter.models.Courses;
import com.example.springbootstarter.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CoursesService {

    @Autowired
    private CoursesRepository coursesRepository;

    public List<Courses> getAllCourses(String id){
        List<Courses> courses = coursesRepository.findAllByTopicsId(id);
        return courses;
    }

    public Optional<Courses> getCourse(String id){
        return coursesRepository.findById(id);
    }

    public void createCourse(Courses course){
        coursesRepository.save(course);
    }

    public void updateCourse(Courses course){
        coursesRepository.save(course);
    }

    public void deleteCourse(String id){
        coursesRepository.deleteById(id);
    }

}
