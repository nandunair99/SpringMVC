package com.narola.springmvcdemo;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class StudentValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(Student.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Student student = (Student) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name connot be empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "subject", "Subject cannot be empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "roll", "Roll cannot be empty");
    }
}
