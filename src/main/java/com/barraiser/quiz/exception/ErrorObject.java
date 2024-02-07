package com.barraiser.quiz.exception;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@EqualsAndHashCode
@ToString
public class ErrorObject {

    private String msg;
    private String details;
    private LocalDateTime date_time;

    public ErrorObject(String msg,String details)
    {
        this.msg=msg;
        this.details=details;
        this.date_time=LocalDateTime.now();
    }

}
