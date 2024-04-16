public class MCQQuestion implements Question{

    private String question;

    @Override
    public void addQuestion(String question) {
        System.out.println("Creating MCQ question\n" + question);

    }
}
