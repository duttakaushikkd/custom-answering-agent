package com.example.CustomAnswerAgent.Controller;

import com.example.CustomAnswerAgent.Service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customizer/v1")
public class AnswerController {

    @Autowired
    AnswerService answerService;

    @GetMapping("/answer")
    public String getAnswer(String question){
        return answerService.openAiService(question);
    }


}
