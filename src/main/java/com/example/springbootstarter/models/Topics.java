package com.example.springbootstarter.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "topics_detail")
public class Topics{

    @Id
    public String id;
    public String name;
    public String description;

}