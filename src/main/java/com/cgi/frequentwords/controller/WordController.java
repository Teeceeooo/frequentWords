package com.cgi.frequentwords.controller;

import com.cgi.frequentwords.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WordController {

    @Autowired
    private WordService wordService;

    @PostMapping("/count")
    public Map<String, Long> countWords(@RequestBody String text) {
        return wordService.getTopFrequentWords(text, 10);
    }
}