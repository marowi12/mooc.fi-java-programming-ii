package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

/**
 * For the dictionary, implement a constructor which takes no parameters, and
 * the following methods:
 */
public class SaveableDictionary {

    private final HashMap<String, String> map;
    private String filePath;

    public SaveableDictionary() {
        this.map = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.map = new HashMap<>();
        this.filePath = file;
    }
    //  ..which loads the dictionary from the file given to the constructor as a parameter.
//If the program is unable to open the file or read from it, the method returns false, otherwise it returns true.

    public boolean load() {
        try {
            Scanner filereader = new Scanner(Paths.get(filePath));
            while (filereader.hasNextLine()) {

                String row = filereader.nextLine();
                String parts[] = row.split(":");
                this.add(parts[0], parts[1]);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
//writes hashmap to given file.txt

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(filePath)) {

            this.map.keySet().forEach((key) -> writer.println(key + ":" + this.map.get(key)));

        } catch (Exception e) {
            return false;
        }
        return true;
    }

    // adds a word to the dictionary.
//Every word has just one translation, and if the same word is added for the second time, nothing happens.
    public void add(String words, String translation) {

        this.map.putIfAbsent(words, translation);
    }

    // returns the translation for the given word. If the word is not in the dictionary, returns null.
    public String translate(String word) {
        if (this.map.values().contains(word)) {
            for (String key : this.map.keySet()) {
                if (this.map.get(key).equals(word)) {
                    return key;
                }

            }
        }
        return this.map.getOrDefault(word, null);
    }

    //    Add the dictionary method which deletes the given word and its translation from the dictionary.
    public void delete(String word) {
        if (map.values().contains(word)) {
            for (String key : map.keySet()) {
                if (map.get(key).equals(word)) {
                    map.remove(key);
                    break;
                }
            }
        }
        map.remove(word);
    }
}
