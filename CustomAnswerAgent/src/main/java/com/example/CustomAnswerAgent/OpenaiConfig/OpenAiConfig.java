package com.example.CustomAnswerAgent.OpenaiConfig;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import org.springframework.stereotype.Component;

@Component
public class OpenAiConfig {

    OpenAIClient client = OpenAIOkHttpClient.fromEnv();

    public OpenAIClient getClient(){
        return this.client;
    }


}
