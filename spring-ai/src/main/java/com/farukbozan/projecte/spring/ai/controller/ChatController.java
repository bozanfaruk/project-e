package com.farukbozan.projecte.spring.ai.controller;

import com.farukbozan.projecte.spring.ai.model.SingerSong;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
public class ChatController {

    private final ChatClient chatClient;

    public ChatController(ChatClient.Builder builder) {
        this.chatClient = builder
                .defaultSystem("Cevaplarken bütün harfleri büyük harf olarak yaz")
                .build();
    }

    //user-prompt
    @GetMapping("/user")
    public String chat(@RequestParam String message) {
        return chatClient.prompt()
                         .user(message)
                         .call()
                         .content();
    }

    //system-prompt
    @GetMapping("/system")
    public String chatWithSystemMessage(@RequestParam String message) {
        return chatClient.prompt()
                         .system("Cevaplarken bütün harfleri büyük harf olarak yaz")
                         .user(message)
                         .call()
                         .content();
    }

    //prompt-with-param
    @GetMapping("/param")
    public String chatWithParam(@RequestParam String topic) {
        return chatClient.prompt()
                         .user(p -> p.text("Bana {topic} hakkkında soğuk espri yap").param("topic", topic))
                         .call()
                         .content();
    }

    //Structured Responses
    //entity-response
    @GetMapping("/song")
    public SingerSong chatWithEntityResponse(@RequestParam String topic) {
        return chatClient.prompt()
                         .user(p -> p.text("Bana {topic} isimli şarkıcının 10 şarkısını yaz").param("topic", topic))
                         .call()
                         .entity(SingerSong.class);
    }

    //list-of-entity-response
    @GetMapping("/song-list")
    public List<SingerSong> chatWithListOfEntityResponse() {
        return chatClient.prompt()
                         .user("Bana Müslüm Gürses, Rammstein, Erkin Koray isimli şarkıcıların 10 şarkısını yaz")
                         .call()
                         .entity(new ParameterizedTypeReference<>() {
                         });
    }

    //Stream example
    @GetMapping("/stream")
    public Flux<String> stream() {
        return chatClient.prompt()
                         .user("Türkiye deki en büyük 20 şehri yaz")
                         .stream()
                         .content();
    }

    //Function calling example
    @GetMapping("/function")
    public String chatWithFunction(@RequestParam String message) {
        return chatClient.prompt()
                         .functions("currentWeatherFunction")
                         .user(message)
                         .call()
                         .content();
    }
}
