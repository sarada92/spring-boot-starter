package com.example.springbootstarter.repository;

import com.example.springbootstarter.models.Topics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicsRepository extends JpaRepository<Topics, String> {

}
