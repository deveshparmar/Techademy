public class Video implements ContentElement{
    @Override
    public void accept(ContentVisitor visitor) {
        visitor.visit(this);
    }
}
