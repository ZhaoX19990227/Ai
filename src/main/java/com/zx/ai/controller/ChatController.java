package com.zx.ai.controller;

import com.zx.ai.aiService.AiService;
import dev.langchain4j.model.openai.OpenAiChatModel;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ChatController {

//    @Resource
//    private OpenAiChatModel model;

    @Resource
    AiService AiService;

//    @RequestMapping("/chat")
//    public String chat(@RequestParam(name = "message", required = true) String message) {
//        return model.chat(message);
//    }

    @RequestMapping("/chat")
    public String chat(@RequestParam(name = "message", required = true) String message) {
        return AiService.chat(message);
    }

    @RequestMapping(value = "/chatForFlux", produces = "text/html;charset=UTF-8")
    public Flux<String> chatForFlux(@RequestParam(name = "message", required = true) String message) {
        return AiService.chatForFlux(message);
    }
}
