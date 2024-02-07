package com.barraiser.quiz.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class QuizAdviceController {

    @ExceptionHandler(QuestionsNotFoundException.class)
    public ResponseEntity<ErrorObject>noQuestionsFoundException(QuestionsNotFoundException ex)
    {
     ErrorObject obj=new ErrorObject(ex.getMsg(),ex.getReason());
     return new ResponseEntity<ErrorObject>(obj, HttpStatus.NOT_FOUND);
    }
}
