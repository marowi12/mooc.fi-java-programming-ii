
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author marvin
 */
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> map;

    public DictionaryOfManyTranslations() {
        this.map = new HashMap<>();

    }

    //adds the translation for the word and preserves the old translations.
    public void add(String word, String translation) {
        this.map.putIfAbsent(word, new ArrayList<>());
        if (this.map.containsKey(word)) {
            this.map.get(word).add(translation);
        }

    }

    //returns a list of the translations added for the word. If the word has no translations, the method should return an empty list.
    public ArrayList<String> translate(String word) {
        if (this.map.containsKey(word)) {
            return this.map.get(word);
        }
        return new ArrayList<>();
    }

    // removes the word and all its translations from the dictionary.
    public void remove(String word) {
        if (this.map.containsKey(word)) {
            this.map.remove(word);
        }
    }

}
