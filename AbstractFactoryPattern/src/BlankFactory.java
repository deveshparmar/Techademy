public class BlankFactory implements QuestionFactory{
    @Override
    public Question createQuestion() {
        return new BlankQuestion();
    }

    @Override
    public Answer createAnswer() {
        return new BlankAnswer();
    }
}
