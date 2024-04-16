public class MCQAnswer implements Answer{

    private String answer;

    @Override
    public void addAnswer(String answer) {
        System.out.println("Creating MCQ answer\n" + answer);
    }
}
