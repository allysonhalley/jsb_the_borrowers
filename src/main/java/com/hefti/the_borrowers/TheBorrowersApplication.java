package com.hefti.the_borrowers;

import com.hefti.the_borrowers.model.Thing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class TheBorrowersApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheBorrowersApplication.class, args);
    }
}
