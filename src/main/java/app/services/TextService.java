package app.services;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TextService {
    public List<String> convertStrings(List<String> stringList) {
        return stringList.stream()
                .sorted(Comparator.comparing(String::length).thenComparing(String::compareTo))
                .map(str -> String.format("(%d): %s", str.length(), str))
                .collect(Collectors.toList());
    }
}
