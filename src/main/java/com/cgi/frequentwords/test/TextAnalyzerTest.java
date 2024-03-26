package com.cgi.frequentwords.test;

import com.cgi.frequentwords.service.WordService;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;

public class TextAnalyzerTest {

    @Test
    public void testGetTopFrequentWords() {
        WordService wordService = new WordService();

        String text = "test text test text test";

        Map<String, Long> topWords = wordService.getTopFrequentWords(text, 2);

        assertEquals("Resultatet ska innehålla 2 ord", 2, topWords.size());

        assertTrue("Ordet 'test' ska forekomma 3 gånger", topWords.containsKey("test") && topWords.get("test") == 3);

        assertTrue("Ordet 'text' ska forekomma 2 gånger", topWords.containsKey("text") && topWords.get("text") == 2);
    }
}
