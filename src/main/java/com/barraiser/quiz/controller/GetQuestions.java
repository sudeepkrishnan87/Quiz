package com.barraiser.quiz.controller;

import com.barraiser.quiz.exception.QuestionsNotFoundException;
import com.barraiser.quiz.modal.Questions;
import com.barraiser.quiz.services.QuestionServices;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetQuestions {
    private QuestionServices questionServices;

    public GetQuestions(QuestionServices questionServices)
    {
        this.questionServices=questionServices;
    }
    @GetMapping("/questions")
    public ResponseEntity<List<Questions>> getQuestions()
    {
        List<Questions> listOfQuestions=questionServices.getQuestions();
        if(listOfQuestions.isEmpty())
        {
          throw new QuestionsNotFoundException("NoQuestions","Empty List");
        }
        return new ResponseEntity(listOfQuestions, HttpStatus.OK);
    }
}
