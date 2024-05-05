public class App {
    public static void main(String[] args) {
        ContentElement[] elements = { new Article(), new Image(), new Video() };

        // Renderer visitor
        ContentVisitor renderer = new Renderer();
        for (ContentElement element : elements) {
            element.accept(renderer);
        }

        // Exporter visitor
        ContentVisitor exporter = new Exporter();
        for (ContentElement element : elements) {
            element.accept(exporter);
        }
    }
}
