package com.example.CustomAnswerAgent.Service;

import com.example.CustomAnswerAgent.OpenaiConfig.OpenAiConfig;
import com.openai.models.responses.Response;
import com.openai.models.responses.ResponseCreateParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {

    @Autowired
    OpenAiConfig openAiConfig;

    public String openAiService(String question){

        ResponseCreateParams params = ResponseCreateParams.builder()
                .input(question)
                .model(System.getenv("GPT_MODEL"))
                .build();

        Response response = openAiConfig
                .getClient()
                .responses()
                .create(params);

        return response.output().toString();
    }
}
