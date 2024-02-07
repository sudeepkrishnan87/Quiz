package com.barraiser.quiz.services;

import com.barraiser.quiz.modal.Questions;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServices {

    public List<Questions> getQuestions()
    {
        return new ArrayList<Questions>();
    }
}
