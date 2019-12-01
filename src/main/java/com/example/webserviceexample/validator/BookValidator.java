package com.example.webserviceexample.validator;

import com.example.webserviceexample.vo.Book;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BookValidator implements ConstraintValidator<ValidBook, Book>{

    @Override
    public void initialize(ValidBook constraintAnnotation) {

    }

    @Override
    public boolean isValid(Book book, ConstraintValidatorContext constraintValidatorContext) {

        boolean isValid = true;
        if(book.getName().startsWith("comp")){

            isValid = false;
        }

        if(!isValid) {
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext
                    .buildConstraintViolationWithTemplate( "Book Name can not start with comp" )
                    .addConstraintViolation();
        }
        return isValid;
    }
}
