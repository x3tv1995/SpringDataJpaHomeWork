package ru.lesson.springdatajpahomework.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique=true)
    private String name;

    private LocalDate birthDate;

@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
@JoinColumn(name = "iphone_id")
   private Iphone iphone;


    public Student() {}



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", iphone=" + iphone +
                '}';
    }

    public Student(String name, LocalDate birthDate ,Iphone iphone) {
        this.name = name;
        this.birthDate = birthDate;
        this.iphone = iphone;

    }
}
