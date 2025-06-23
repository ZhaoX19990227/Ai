package com.zx.ai.aiService;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiServiceWiringMode;
import reactor.core.publisher.Flux;

//@dev.langchain4j.service.spring.AiService(wiringMode = AiServiceWiringMode.EXPLICIT, //手动装配
//        chatModel = "openAiChatModel")// 指定模型

//@dev.langchain4j.service.spring.AiService //即可
@dev.langchain4j.service.spring.AiService(wiringMode = AiServiceWiringMode.EXPLICIT, //手动装配
        chatModel = "openAiChatModel",  // 指定模型
        streamingChatModel = "openAiStreamingChatModel", // 指定流模型
        chatMemoryProvider = "chatMemoryProvider", // 指定会话提供者记忆模型
        contentRetriever = "contentRetriever") // 配置向量数据库检索对象
//        chatMemory = "chatMemory")  // 指定记忆模型
public interface AiService {
    String chat(String message);

    @SystemMessage(fromResource = "system.txt")
    Flux<String> chatForFlux(@MemoryId String memoryId, @UserMessage String message);
}
