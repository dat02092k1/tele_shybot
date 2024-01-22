package yotech.learn.teledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
})
public class TeleDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeleDemoApplication.class, args);

            ShyBot shyBot = new ShyBot();

            shyBot.sendMessage();

    }

}
