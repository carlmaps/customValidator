package com.example.CustomValidator.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FieldTrip {

    @Id
    private long id;
    private String name;
    private int age;
    private String guardian;
}
