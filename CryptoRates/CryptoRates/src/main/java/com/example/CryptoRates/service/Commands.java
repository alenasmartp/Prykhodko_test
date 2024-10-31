package com.example.CryptoRates.service;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;

import java.util.List;

@Component
public class Commands extends BotCommand {
    List<BotCommand> LIST_OF_COMMANDS = List.of(
            new BotCommand("/start", "start bot"),
            new BotCommand("/subscribe", "subscribe crypto"),
            new BotCommand("/unsubscribe", "unsubscribe crypto"),
            new BotCommand("/list", "show subscriptions list"),
            new BotCommand("/help", "bot info")
    );

    String HELP_TEXT = "Этот бот позволит тебе подписаться на курс интересующей тебя криптовалюты и трижды в день получать актуальную информацию. " +
            "Тебе доступны следующие команды:\n\n" +
            "/start - start the bot\n" +
            "/subscribe - subscribe crypto\n" +
            "/unsubscribe - unsubscribe crypto\n" +
            "/list - show subscriptions list\n" +
            "/help - help menu";
}
}

