package com.barraiser.quiz.repository;

import com.barraiser.quiz.modal.QuestionBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionBankRepo extends CrudRepository<QuestionBank, Long> {

}
