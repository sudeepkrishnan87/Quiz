package com.barraiser.quiz.quiz.admin;

import java.util.List;

import com.barraiser.quiz.quiz.modal.Answers;
import com.barraiser.quiz.quiz.modal.OptionsString;
import com.barraiser.quiz.quiz.modal.QuestionBank;
import com.barraiser.quiz.quiz.modal.Questions;
import com.barraiser.quiz.quiz.serviceimpl.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class adminController {
    @Autowired
    private AdminService admService;

    @GetMapping("/admin")
    public String createQuiz()
    {
        return "succesfully Created!!!";
    }
    @PostMapping("/createQuestons")
    public String createQuestionBank(@RequestBody Questions q)
    {
      
       return (admService.questionsStore(q))?"successfully Created!!!":"Error";

    }
    
    @PostMapping("/createOptions")
    public String createOptions(@RequestBody OptionsString op)
    {
      
       return (admService.optionsStore(op))?"successfully Created!!!":"Error";

    }
    @PostMapping("/answerOptions")
    public String createOptions(@RequestBody Answers ans)
    {
      
       return (admService.answersStore(ans))?"successfully Created!!!":"Error";

    }
}
