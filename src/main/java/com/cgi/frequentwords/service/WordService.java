package com.cgi.frequentwords.service;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class WordService {

    public Map<String, Long> getTopFrequentWords(String text, int limit) {
        List<String> words = Arrays.asList(text.toLowerCase().split("\\W+"));

        Map<String, Long> wordCount = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<Map.Entry<String, Long>> entries = new ArrayList<>(wordCount.entrySet());

        entries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        Map<String, Long> sortedByCount = new LinkedHashMap<>();

        int count = 0;
        for(Map.Entry<String, Long> entry : entries) {
            if(count >= limit) break;
            sortedByCount.put(entry.getKey(), entry.getValue());
            count++;
        }
        return sortedByCount;
    }
}
