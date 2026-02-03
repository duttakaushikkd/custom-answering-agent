package com.example.CustomAnswerAgent.OpenaiConfig;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.responses.Response;
import com.openai.models.responses.ResponseCreateParams;
import org.springframework.stereotype.Component;

@Component
public class OpenAiConfig {

    OpenAIClient client = OpenAIOkHttpClient.fromEnv();

    public OpenAIClient getClient(){
        return this.client;
    }


}
