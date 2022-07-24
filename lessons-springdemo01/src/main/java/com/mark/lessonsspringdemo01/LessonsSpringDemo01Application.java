package com.mark.lessonsspringdemo01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Markus
 */
@SpringBootApplication
@MapperScan("com.mark.lessonsspringdemo01.mapper")
public class LessonsSpringDemo01Application {

	public static void main(String[] args) {
		SpringApplication.run(LessonsSpringDemo01Application.class, args);
	}

}
