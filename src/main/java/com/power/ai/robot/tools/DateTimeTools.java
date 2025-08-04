package com.power.ai.robot.tools;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.tool.annotation.Tool;

import java.time.LocalDateTime;

@Slf4j
public class DateTimeTools {
    @Tool(description = "获取当前日期")
    String getCurrentTime() {
        return LocalDateTime.now().toString();
    }
}
