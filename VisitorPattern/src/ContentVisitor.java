import java.awt.*;

public interface ContentVisitor {
    void visit(Article article);
    void visit(Image image);
    void visit(Video video);
}
