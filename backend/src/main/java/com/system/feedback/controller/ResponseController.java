package com.system.feedback.controller;

import com.system.feedback.entity.Response;
import com.system.feedback.repository.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResponseController {
    @Autowired
    private ResponseRepository responseRepository;

    @GetMapping("/responses/")
    public List<Response> getResponses(){
        return responseRepository.findAll();
    }
}
