public class App {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        Character character1 = factory.getCharacter('A');
        character1.display("Arial");

        Character character2 = factory.getCharacter('B');
        character2.display("Calibri");

        Character character3 = factory.getCharacter('C');
        character3.display("Times New Roman");
    }
}
