package com.example.CryptoRates.service;

import lombok.extern.java.Log;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.time.LocalDate;

import static org.glassfish.grizzly.ProcessorExecutor.execute;


@Log
public class MessageService {
    private void sendMessage(Long chatId, String text) {
        String chatIdStr = String.valueOf(chatId);
        SendMessage sendMessage = new SendMessage(chatIdStr, text);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            log.error("Ошибка отправки сообщения", e);
        }
        private void startCommand (Long chatId, String userName){
            String text = " подписаться на курс интересующей тебя криптовалюты и трижды в день получать актуальную информацию.  " +
                    "Тебе доступны следующие команды:\n\n" +
                    "/start - start the bot\n" +
                    "/subscribe - subscribe crypto\n" +
                    "/unsubscribe - unsubscribe crypto\n" +
                    "/list - show subscriptions list\n" +
                    "/help - help menu";
            String formattedText = String.format(text, userName);
            sendMessage(chatId, formattedText);
        }


        private void helpCommand (Long chatId){
            String text = " Справочная информация по боту: " +
                    "Для оформления подписки на криптовалюту, нажми /subscribe_название криптовалюты (например: subscribe bitcoin), чтобы отписаться  /unsubscribe_название криптовалюты;" +
                    "\n" + "Если хочешь хочешь посмотреть весь список подписок: /list;";
            sendMessage(chatId, text);
        }
    }
///остальные сообщения
    private void execute(SendMessage sendMessage) {
    }
}
