public class DocumentEditor {
    private WritingMode state;

    public DocumentEditor() {
        // Initially, set the state to plain text mode
        state = new PlainTextMode();
    }

    public void setState(WritingMode state) {
        this.state = state;
    }

    public void write(String text) {
        state.write(text);
    }
}
