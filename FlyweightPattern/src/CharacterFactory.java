import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<java.lang.Character, Character> map;

    public CharacterFactory() {
        this.map = new HashMap<>();
    }

    public Character getCharacter(char c){
        Character character = map.get(c);
        if (character==null){
            character = new ConcreteCharacter(c);
            map.put(c,character);
        }
        return character;
    }
}
