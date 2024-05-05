import java.util.Stack;

public class TextEditorHistory {
    private final Stack<TextEditorMemento> states = new Stack<>();

    public void push(TextEditorMemento memento) {
        states.push(memento);
    }

    public TextEditorMemento pop() {
        return states.pop();
    }
}
