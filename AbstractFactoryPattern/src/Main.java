
public class Main {
    public static void main(String[] args) {
       QuestionFactory mcqFactory = new MCQFactory();
       Question mcqQuestion = mcqFactory.createQuestion();
       Answer mcqANswer = mcqFactory.createAnswer();

       mcqQuestion.addQuestion("MCQ question");
       mcqANswer.addAnswer("MCQ answer");

        QuestionFactory blankFactory = new BlankFactory();
        Question blankQuestion = blankFactory.createQuestion();
        Answer blankAnswer = blankFactory.createAnswer();

        blankQuestion.addQuestion("Blank question");
        blankAnswer.addAnswer("Blank answer");


        QuestionFactory dropdownFactory = new DropdownFactory();
        Question dropdownQuestion = dropdownFactory.createQuestion();
        Answer dropdownAnswer = dropdownFactory.createAnswer();

        dropdownQuestion.addQuestion("Dropdown question");
        dropdownAnswer.addAnswer("Dropdown answer");
    }
}