package ru.lesson.springdatajpahomework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lesson.springdatajpahomework.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
