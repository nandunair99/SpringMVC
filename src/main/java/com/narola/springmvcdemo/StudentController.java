package com.narola.springmvcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentValidator studentValidator = new StudentValidator();

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(studentValidator);
    }

    @GetMapping(name = "test Api", value = "/demo")
    public ResponseEntity<String> testHello() {
        return ResponseEntity.ok("Hello Students from student controller");
    }

    @RequestMapping(value = "/getStudent", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ModelAndView getStudent(@Validated Student student, BindingResult bindingResult) {
        ModelAndView modelAndView;
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrorList = bindingResult.getFieldErrors();

            modelAndView = new ModelAndView("errorview");
            modelAndView.addObject("errorList", fieldErrorList);
        } else {
            modelAndView = new ModelAndView("studentview");
            modelAndView.addObject("stud", student);
        }

        return modelAndView;
    }

    @GetMapping("/studentForm")
    public String loadStudentform() {
        return "studentform";
    }
}
