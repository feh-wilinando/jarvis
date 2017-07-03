package br.com.caelum.jarvis.bots;

import me.ramswaroop.jbot.core.slack.Bot;
import me.ramswaroop.jbot.core.slack.Controller;
import me.ramswaroop.jbot.core.slack.EventType;
import me.ramswaroop.jbot.core.slack.models.Event;
import me.ramswaroop.jbot.core.slack.models.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;

/**
 * Created by nando on 24/06/17.
 */
@Component
public class Jarvis extends Bot {


    @Value("slackBotToken")
    private String token;


    @Override
    public String getSlackToken() {
        return token;
    }

    @Override
    public Bot getSlackBot() {
        return this;
    }


    @Controller(events ={EventType.DIRECT_MESSAGE} ,pattern = "(horas)", next = "projectMessage")
    public void horas(WebSocketSession session, Event event) throws IOException {

        startConversation(event, "projectMessage");
        reply(session, event, new Message("Projetos (a), (b), (c)"));
    }

    @Controller(next = "finishim")
    public void projectMessage(WebSocketSession session, Event event){

        reply(session, event, new Message("Tem Certeza?"));
        nextConversation(event);
    }

    @Controller
    public void finishim(WebSocketSession session, Event event){

        reply(session, event, new Message("Lançamento efetuado com sucesso!"));

        stopConversation(event);
    }

}
