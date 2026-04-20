package Tehtava15.Model;

import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> data = new HashMap<>();

    public Dictionary() {

        data.put("kissa", "Cat, a small domesticated animal.");
        data.put("talo", "House, a building where people live.");
        data.put("kirja", "Book, a written or printed work.");
    }

    public void addWord(String word, String meaning) {
        data.put(word.toLowerCase(), meaning);
    }

    public String search(String word) throws Exception {
        String result = data.get(word.toLowerCase());
        if (result == null) {
            throw new Exception("The word was not found in the dictionary.");
        }
        return result;
    }
}

