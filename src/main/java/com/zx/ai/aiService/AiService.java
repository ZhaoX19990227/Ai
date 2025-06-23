package com.zx.ai.aiService;

import dev.langchain4j.service.spring.AiServiceWiringMode;
import reactor.core.publisher.Flux;

//@dev.langchain4j.service.spring.AiService(wiringMode = AiServiceWiringMode.EXPLICIT, //手动装配
//        chatModel = "openAiChatModel")// 指定模型

//@dev.langchain4j.service.spring.AiService //即可
@dev.langchain4j.service.spring.AiService(wiringMode = AiServiceWiringMode.EXPLICIT, //手动装配
        chatModel = "openAiChatModel",
        streamingChatModel = "openAiStreamingChatModel")// 指定模型
public interface AiService {
    String chat(String message);

    Flux<String> chatForFlux(String message);
}
