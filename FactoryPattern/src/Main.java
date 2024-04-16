
public class Main {
    public static void main(String[] args) {
       Question mcq = QuestionFactory.createQuestion("MCQ");
       mcq.addQuestion("MCQ question");
       mcq.addAnswer("MCQ answer");
       mcq.addMarks(1);

        Question blank = QuestionFactory.createQuestion("Blank");
        mcq.addQuestion("Blank question");
        mcq.addAnswer("Blank answer");
        mcq.addMarks(2);

        Question dropdown = QuestionFactory.createQuestion("Dropdown");
        mcq.addQuestion("Dropdown question");
        mcq.addAnswer("Dropdown answer");
        mcq.addMarks(2);
    }
}