public class App {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor("");

        TextEditorHistory history = new TextEditorHistory();

        // User writes some content
        editor.setContent("Hello, World!");
        // Save the state
        history.push(editor.save());

        // User continues writing
        editor.setContent("Hello, World! This is a text editor.");
        // Save the state
        history.push(editor.save());

        // User wants to undo
        editor.restore(history.pop());
        System.out.println(editor.getContent());

        // User continues writing again
        editor.setContent("Hello, World! This is a text editor. Lets code something");
        // Save the state
        history.push(editor.save());

        // User wants to undo again
        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }
}
