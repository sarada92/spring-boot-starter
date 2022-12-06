package com.example.springbootstarter.repository;

import com.example.springbootstarter.models.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, String> {

    public List<Courses> findAllByTopicsId(String id);

}
