package com.barraiser.quiz.quiz.service;

import java.util.List;

import com.barraiser.quiz.quiz.modal.Answers;
import com.barraiser.quiz.quiz.modal.OptionsString;
import com.barraiser.quiz.quiz.modal.Questions;

public interface StoreService {

    public boolean questionsStore(Questions que);
    public boolean optionsStore(OptionsString options);
    public boolean answersStore(Answers ans);
    
}
