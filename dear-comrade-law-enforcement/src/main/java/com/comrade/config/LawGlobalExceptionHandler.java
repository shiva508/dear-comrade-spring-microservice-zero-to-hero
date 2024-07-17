package com.comrade.config;

import com.comrade.model.CommonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class LawGlobalExceptionHandler {

    @ExceptionHandler(RecordNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CommonResponse issue(RecordNotFoundException exception){
        return CommonResponse.builder().message(exception.getMessage()).statusCode(202).timeStamp(new Date()) .build();
    }

}
