package app.enums;

public enum Months {
    January("Я-Н-В-А-Р-Ь"),
    February("Ф-Е-В-Р-А-Л-Ь"),
    March("М-А-Р-Т"),
    April("А-П-Р-Е-Л-Ь"),
    May("М-А-Й"),
    June("И-Ю-Н-Ь"),
    July("И-Ю-Л-Ь"),
    August("А-В-Г-У-С-Т"),
    September("С-Е-Н-Т-Я-Б-Р-Ь"),
    October("О-К-Т-Я-Б-Р-Ь"),
    November("Н-О-Я-Б-Р-Ь"),
    December("Д-Е-К-А-Б-Р-Ь");

    private String value;

    Months(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
