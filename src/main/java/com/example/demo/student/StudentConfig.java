package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student("Mariam", 15, LocalDate.of(2000, Month.APRIL, 3), "mariamsmith@gmail.com");
            Student jack = new Student("Jack", 20, LocalDate.of(2002, Month.APRIL, 3), "jacksmith@gmail.com");
            repository.saveAll(
                    List.of(mariam, jack)
            );
        };
    }
}
