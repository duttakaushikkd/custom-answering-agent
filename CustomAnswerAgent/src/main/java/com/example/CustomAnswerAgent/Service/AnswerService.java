package com.example.CustomAnswerAgent.Service;

import com.example.CustomAnswerAgent.OpenaiConfig.OpenAiConfig;
import com.openai.models.responses.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AnswerService {

    @Autowired
    private OpenAiConfig openAiConfig;

    public String openAiService(String question) {

        String combinedPrompt =
                "SYSTEM:\n" + System.getenv("SYSTEM_PROMPT") + "\n\n" +
                        "USER:\n" + question;

        ResponseCreateParams params = ResponseCreateParams.builder()
                .model(System.getenv("GPT_MODEL"))
                .input(combinedPrompt)
                .build();

        Response response = openAiConfig
                .getClient()
                .responses()
                .create(params);

        return response.toString();
    }
}
