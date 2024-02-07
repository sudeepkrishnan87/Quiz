package com.barraiser.quiz.exception;

import lombok.Getter;

@Getter
public class QuestionsNotFoundException extends RuntimeException{

    private String msg;
    private String reason;
    public QuestionsNotFoundException(String msg,String reason)
    {
        super(msg);
        this.msg=msg;
        this.reason=reason;
    }

}
