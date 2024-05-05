public class PlainTextMode implements WritingMode{
    @Override
    public void write(String text) {
        System.out.println("Writing in plain text: " + text);
    }
}
