package com.zx.ai.config;

import com.zx.ai.aiService.AiService;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {

    @Resource
    OpenAiChatModel openAiChatModel;

//    @Bean
//    public AiService aiService() {
//        return AiServices.builder(AiService.class)
//                .chatModel(openAiChatModel)
//                .build();
//    }
}
