public class Blank implements Question{
    private String question;
    private String answer;
    private int marks;

    @Override
    public void addQuestion(String question) {
        System.out.println("Creating Blank question\n" + question);

    }

    @Override
    public void addAnswer(String answer) {
        System.out.println("Creating Blank answer\n" + answer);
    }

    @Override
    public void addMarks(int marks) {
        System.out.println("This question is of marks - "+marks);
    }
}
