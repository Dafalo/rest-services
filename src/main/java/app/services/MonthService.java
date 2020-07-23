package app.services;

import app.enums.Months;
import org.springframework.stereotype.Service;

@Service
public class MonthService {
    private final Months[] months = Months.values();

    public String getMonth(int monthNumber) {
        return months[monthNumber - 1].getValue();
    }
}
