package com.example.CryptoRates.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;
import java.util.Properties;

public class BotConfig {
    @Configuration
    @Data
    @PropertySource("config.properties")
    public class BotConfiguration {
        @Value("${bot.name}")
        String botName;
        @Value("${bot.token}")
        String token;

    }
}
