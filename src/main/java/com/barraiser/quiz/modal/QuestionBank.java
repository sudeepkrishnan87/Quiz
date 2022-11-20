package com.barraiser.quiz.modal;


import java.util.List;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class QuestionBank {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Long id;
private String questions;
private String options;
private int correctAns;
}
