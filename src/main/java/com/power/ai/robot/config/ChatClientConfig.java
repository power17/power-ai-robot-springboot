package com.power.ai.robot.config;

import com.power.ai.robot.advisor.MyLoggerAdvisor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.deepseek.DeepSeekChatModel;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatClientConfig {
    /**
     * 初始化 ChatClient 客户端
     * @param chatModel
     * @return
     */
    @Bean
    public ChatClient chatClient(DeepSeekChatModel chatModel, ChatMemory chatMemory, ToolCallbackProvider tools) {
        return ChatClient.builder(chatModel)
                .defaultToolCallbacks(tools) // MCP
//                .defaultSystem("请你扮演一名 Java 项目实战专栏的客服人员")
                .defaultAdvisors(new SimpleLoggerAdvisor(),
                       // new MyLoggerAdvisor(),
                        MessageChatMemoryAdvisor.builder(chatMemory).build()) // 添加 Spring AI 内置的日志记录功能
                .build();
    }


}
