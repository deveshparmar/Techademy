// Concrete visitor class - Renderer

public class Renderer implements ContentVisitor{
    @Override
    public void visit(Article article) {
        System.out.println("Rendering article...");
    }

    @Override
    public void visit(Image image) {
        System.out.println("Rendering image...");
    }

    @Override
    public void visit(Video video) {
        System.out.println("Rendering video...");
    }
}
