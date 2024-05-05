// Concrete visitor class - Exporter

public class Exporter implements ContentVisitor{
    @Override
    public void visit(Article article) {
        System.out.println("Exporting article...");
    }

    @Override
    public void visit(Image image) {
        System.out.println("Exporting image...");
    }

    @Override
    public void visit(Video video) {
        System.out.println("Exporting video...");
    }
}
