package com.barraiser.quiz.services;

import com.barraiser.quiz.exception.QuestionsNotFoundException;
import com.barraiser.quiz.modal.QuestionBank;
import com.barraiser.quiz.repository.QuestionBankRepo;
import com.barraiser.quiz.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    private QuestionBankRepo questionBankRepo;

    AdminService(QuestionBankRepo questionBankRepo)
    {
        this.questionBankRepo=questionBankRepo;
    }

    public QuestionBank addSingleQuestion(Optional<QuestionBank> questions)
    {
        if(questions.isPresent())
             return questionBankRepo.save(questions.get());

        else
            throw new QuestionsNotFoundException("Empty Question","Question is not Available");
    }

    public String addBulkQuestions(MultipartFile file) {

        return Constant.BULK_INSERT_SUCCESS;

    }
}
