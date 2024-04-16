public class MCQFactory implements QuestionFactory{
    @Override
    public Question createQuestion() {
        return new MCQQuestion();
    }

    @Override
    public Answer createAnswer() {
        return new MCQAnswer();
    }
}
