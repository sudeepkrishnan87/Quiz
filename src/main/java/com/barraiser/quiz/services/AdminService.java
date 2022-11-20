package com.barraiser.quiz.services;

import com.barraiser.quiz.modal.QuestionBank;
import com.barraiser.quiz.repository.QuestionBankRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    private QuestionBankRepo questionBankRepo;

    AdminService(QuestionBankRepo questionBankRepo)
    {
        this.questionBankRepo=questionBankRepo;
    }

    public QuestionBank addSingleQuestion(QuestionBank questions)
    {
        return questionBankRepo.save(questions);
    }

}
