package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        String[] words = sentence.toLowerCase().split("[\\s.,]");

        for (String word : words) {
            word = word.trim();

            if (!word.isEmpty() && wordFrequency.containsKey(word)) {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            }
            else if (!word.isEmpty())
                wordFrequency.put(word, 1);
        }

        return wordFrequency;
    }
}
