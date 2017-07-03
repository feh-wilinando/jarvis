package br.com.caelum.jarvis.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.Enumeration;

/**
 * Created by nando on 24/06/17.
 */
@RestController
public class JarvisController {


    @Value("${slashCommandToken}")
    private String slackToken;


    @RequestMapping("/hi")
    public String  hi(@RequestBody String  json, HttpServletRequest request) {

        System.out.println("Hi" + request.getMethod());
        System.out.println(json);



        return "Olá Eu sou a Leticia!";
//        return "{\n" +
//                "    \"text\": \"Would you like to play a game?\",\n" +
//                "    \"attachments\": [\n" +
//                "        {\n" +
//                "            \"text\": \"Choose a game to play\",\n" +
//                "            \"fallback\": \"You are unable to choose a game\",\n" +
//                "            \"callback_id\": \"buttons\",\n" +
//                "            \"color\": \"#3AA3E3\",\n" +
//                "            \"attachment_type\": \"default\",\n" +
//                "            \"actions\": [\n" +
//                "                {\n" +
//                "                    \"name\": \"game\",\n" +
//                "                    \"text\": \"Chess\",\n" +
//                "                    \"type\": \"button\",\n" +
//                "                    \"value\": \"chess\"\n" +
//                "                },\n" +
//                "                {\n" +
//                "                    \"name\": \"game\",\n" +
//                "                    \"text\": \"Falken's Maze\",\n" +
//                "                    \"type\": \"button\",\n" +
//                "                    \"value\": \"maze\"\n" +
//                "                },\n" +
//                "                {\n" +
//                "                    \"name\": \"game\",\n" +
//                "                    \"text\": \"Thermonuclear War\",\n" +
//                "                    \"style\": \"danger\",\n" +
//                "                    \"type\": \"button\",\n" +
//                "                    \"value\": \"war\",\n" +
//                "                    \"confirm\": {\n" +
//                "                        \"title\": \"Are you sure?\",\n" +
//                "                        \"text\": \"Wouldn't you prefer a good game of chess?\",\n" +
//                "                        \"ok_text\": \"Yes\",\n" +
//                "                        \"dismiss_text\": \"No\"\n" +
//                "                    }\n" +
//                "                }\n" +
//                "            ]\n" +
//                "        }\n" +
//                "    ]\n" +
//                "}";

    }


    @RequestMapping("/buttons")
    public String buttons(@RequestBody String json, HttpServletRequest request){
//        Enumeration<String> parameterNames = request.getParameterNames();

        System.out.println("Buttons" + request.getMethod());


        System.out.println(json);
//        Collections.list(parameterNames).forEach(parName -> {
//
//            System.out.println(parName +":" + request.getParameter(parName));
//
//        });


        return "OK";
    }



    @RequestMapping("/options")
    public String[] options(@RequestBody String json, HttpServletRequest request){
//        Enumeration<String> parameterNames = request.getParameterNames();

        System.out.println("options" + request.getMethod());
        System.out.println(json);
//        Collections.list(parameterNames).forEach(parName -> {
//
//            System.out.println(parName +":" + request.getParameter(parName));
//
//        });


        return new String[]{"ABC","DEF","GHI"};
    }
}
