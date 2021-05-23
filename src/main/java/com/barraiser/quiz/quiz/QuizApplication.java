package com.barraiser.quiz.quiz;

import com.barraiser.quiz.quiz.modal.QuestionBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
		//System.out.println("hi");
	}
	@Bean
	public QuestionBank creaQuestionBank()
	{
		return new QuestionBank();
	}

}
