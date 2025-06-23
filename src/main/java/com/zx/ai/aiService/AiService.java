package com.zx.ai.aiService;

import dev.langchain4j.service.spring.AiServiceWiringMode;

//@dev.langchain4j.service.spring.AiService(wiringMode = AiServiceWiringMode.EXPLICIT, //手动装配
//        chatModel = "openAiChatModel")// 指定模型

@dev.langchain4j.service.spring.AiService
public interface AiService {
    String chat(String message);
}
