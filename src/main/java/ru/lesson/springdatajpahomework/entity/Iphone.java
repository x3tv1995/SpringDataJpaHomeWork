package ru.lesson.springdatajpahomework.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Iphone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String brand;
    private String model;

    @OneToOne(mappedBy = "iphone")
    private Student student;


    public Iphone(String brand,String model) {
        this.brand = brand;
        this.model = model;

    }
    public Iphone() {}


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", id=" + id +
                '}';
    }
}
