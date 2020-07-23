package app.controllers;

import app.services.MonthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonthController {
    private final MonthService monthService;

    public MonthController(MonthService monthService) {
        this.monthService = monthService;
    }

    @GetMapping("/get")
    public String getMonth(@RequestParam int monthNumber) {
        if (monthNumber > 0 && monthNumber < 13) {
            return monthService.getMonth(monthNumber);
        } else return "INCORRECT INPUT DATA";
    }
}
