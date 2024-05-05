public class App {
    public static void main(String[] args) {
        DocumentEditor editor = new DocumentEditor();

        // Writing in different modes
        editor.write("Plain text");

        editor.setState(new BoldMode());
        editor.write("Bold text");

        editor.setState(new ItalicMode());
        editor.write("Italic text");

        editor.setState(new PlainTextMode());
        editor.write("Another plain text");
    }
}
