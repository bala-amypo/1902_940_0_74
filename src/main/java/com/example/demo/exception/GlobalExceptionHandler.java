package com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import java.util.Map;
import java.util
@RestControllerAdvice
public class GlobalExceptionHandler{
@ExceptionHandler(ResourceNotFoundException.class) //runtime exception
    public ResponseEntity<String> handleNotFound(ResourceNotFoundException ex){
        return new ResponseEntity<>.(ex.getMessage(),HttpStatus.NOT_FOUND); 

    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>> handleMethod(MethodArgumentNotValidException)
    Map<String,String> error=new HashMap<>();
    ex.getBindingResult().getFieldErros().forEach(error -> errors.put(error.getField(),error.getDefaultMessage())
    );
    return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
}
