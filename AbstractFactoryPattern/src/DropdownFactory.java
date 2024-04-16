public class DropdownFactory implements QuestionFactory{
    @Override
    public Question createQuestion() {
        return new DropdownQuestion();
    }

    @Override
    public Answer createAnswer() {
        return new DropdownAnswer();
    }
}
