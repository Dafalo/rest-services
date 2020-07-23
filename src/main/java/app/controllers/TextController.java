package app.controllers;

import app.services.TextService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TextController {

    private final TextService textService;

    public TextController(TextService textService) {
        this.textService = textService;
    }

    @PostMapping("/convertedStrings")
    public List<String> convertStrings(@RequestBody List<String> list) {
        return textService.convertStrings(list);
    }

}
