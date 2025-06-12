package com.eleven.mcpmysqlstartwebfluxserver;

import com.eleven.mcpmysqlstartwebfluxserver.tools.MysqlTools;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class McpMysqlStartWebfluxServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(McpMysqlStartWebfluxServerApplication.class, args);
    }

    @Bean
    public ToolCallbackProvider weatherTools(MysqlTools mysqlTools) {
        return MethodToolCallbackProvider.builder().toolObjects(mysqlTools).build();
    }
}
