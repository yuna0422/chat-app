package in.tech_camp.chat_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MessagesController {
    @GetMapping("/")
    public String showMessages() {
        return "messages/index";
    }
}
