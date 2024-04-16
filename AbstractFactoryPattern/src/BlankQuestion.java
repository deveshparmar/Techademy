public class BlankQuestion implements Question{
    private String question;

    @Override
    public void addQuestion(String question) {
        System.out.println("Creating Blank question\n" + question);

    }
}
