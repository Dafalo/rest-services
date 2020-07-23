package app.controllers;

import app.services.MonthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonthController {
    private final MonthService monthService;

    public MonthController(MonthService monthService) {
        this.monthService = monthService;
    }

    @GetMapping("/months/{monthNumber}")
    public String getMonth(@PathVariable int monthNumber) {
        if (monthNumber > 0 && monthNumber < 13) {
            return monthService.getMonth(monthNumber);
        } else return "INCORRECT INPUT DATA";
    }
}
