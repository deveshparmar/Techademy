public class TextEditor {
    private String content;

    public TextEditor(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public TextEditorMemento save() {
        return new TextEditorMemento(content);
    }

    // Restores the state from a memento
    public void restore(TextEditorMemento memento) {
        this.content = memento.getContent();
    }
}
