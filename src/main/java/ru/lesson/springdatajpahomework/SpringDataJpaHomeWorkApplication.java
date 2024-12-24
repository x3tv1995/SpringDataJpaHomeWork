package ru.lesson.springdatajpahomework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.lesson.springdatajpahomework.entity.Iphone;
import ru.lesson.springdatajpahomework.entity.Student;
import ru.lesson.springdatajpahomework.repository.StudentRepository;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataJpaHomeWorkApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringDataJpaHomeWorkApplication.class, args);
		StudentRepository studentRepository = context.getBean("studentRepository", StudentRepository.class);

		Iphone iphone1 = new Iphone("Samsung","Galaxy");
		Iphone iphone2 = new Iphone("Apple","Xr");
		Iphone iphone3 = new Iphone("Huawei","Pro");

		Student student1 = new Student("Olya", LocalDate.of(1996,7,3),iphone3);
		Student student2 = new Student("Anton", LocalDate.of(1995,7,20),iphone2);
		Student student3 = new Student("Anna", LocalDate.of(1996,4,3),iphone1);

		studentRepository.save(student1);
		studentRepository.save(student2);
		studentRepository.save(student3);

		iphone1.setStudent(student1);
		iphone2.setStudent(student2);
		iphone3.setStudent(student3);

	}

}
