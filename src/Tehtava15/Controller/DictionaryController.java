package Tehtava15.Controller;

import Tehtava15.Model.Dictionary;

public class DictionaryController {
    Dictionary dictionary;

    public DictionaryController(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public String searchWord(String word) {
        if (word == null || word.isEmpty()) {
            return "Please enter a word.";
        }


        try {
            return dictionary.search(word);
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public void addWord(String word, String meaning) {
        dictionary.addWord(word, meaning);
    }



}

