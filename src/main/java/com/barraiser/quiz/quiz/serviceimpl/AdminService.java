package com.barraiser.quiz.quiz.serviceimpl;

import java.util.List;

import com.barraiser.quiz.quiz.modal.Answers;
import com.barraiser.quiz.quiz.modal.OptionsString;
import com.barraiser.quiz.quiz.modal.QuestionBank;
import com.barraiser.quiz.quiz.modal.Questions;
import com.barraiser.quiz.quiz.service.StoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdminService implements StoreService {
     @Autowired
    private QuestionBank qb;
    @Override
    public boolean questionsStore(Questions que) {
        // TODO Auto-generated method stub
        int size=qb.getQuestions().size();
        qb.getQuestions().put(que.getQuestion(), que.getId());

        if(size<qb.getQuestions().size())
          return true;
       return false;
    }
    @Override
    public boolean optionsStore(OptionsString options) {
        // TODO Auto-generated method stub
        int size=qb.getOptions().size();
        for(String option:options.getOptions())
         qb.getOptions().add(option);
       //Options for question id map
        if(size<qb.getOptions().size())
        return true;
    return false;
    }
    @Override
    public boolean answersStore(Answers ans) {
        // TODO Auto-generated method stub
        int size=qb.getAnswerMap().size();
        qb.getAnswerMap().put(ans.getQuestion(), ans.getId());

        if(size<qb.getAnswerMap().size())
          return true;
       return false;
    }
 
       
    
  
    
   
}
