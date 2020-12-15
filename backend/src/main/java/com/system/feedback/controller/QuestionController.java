package com.system.feedback.controller;

import com.system.feedback.entity.Question;
import com.system.feedback.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController {
    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/questions/")
    public List<Question> getQuestions(){
        return questionRepository.findAll();
    }

}
