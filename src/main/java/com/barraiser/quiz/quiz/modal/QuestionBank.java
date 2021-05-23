package com.barraiser.quiz.quiz.modal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;
@Data
public class QuestionBank {

    Map<String,Integer> questions=new HashMap<>();
    List<String> options=new ArrayList<>();
    Map<List<String>,Integer> optionMap=new HashMap<>();
    Map<Integer,Integer> answerMap=new HashMap<>();
    
}
