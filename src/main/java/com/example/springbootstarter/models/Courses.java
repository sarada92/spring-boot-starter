package com.example.springbootstarter.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "courses_detail")
public class Courses{

    @Id
    public String id;
    public String name;
    public String description;

    @ManyToOne
    public Topics topics;

}