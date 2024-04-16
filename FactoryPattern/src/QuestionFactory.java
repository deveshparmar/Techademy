public class QuestionFactory {
    public static Question createQuestion(String questionType){
        return switch (questionType) {
            case "MCQ" -> new MCQ();
            case "Blank" -> new Blank();
            case "Dropdown" -> new Dropdown();
            default -> throw new IllegalArgumentException("Invalid question type");
        };
    }
}
