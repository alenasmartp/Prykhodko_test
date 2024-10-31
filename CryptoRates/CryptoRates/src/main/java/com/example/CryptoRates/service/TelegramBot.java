package com.example.CryptoRates.service;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Component
@Slf4j
public class TelegramBot extends TelegramLongPollingBot {

    private final TelegramBotsApi telegramBotsApi = new TelegramBotsApi(
            DefaultBotSession.class);

    @Value("${bot.token}")
    private String botToken;

    public TelegramBot() throws TelegramApiException {
    }

    @PostConstruct
    private void init() throws TelegramApiException {
        telegramBotsApi.registerBot(this);
    }

    public void BotComponent() throws TelegramApiException {
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
    }

    @Override
    public String getBotUsername() {
        return "botName";
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

}

