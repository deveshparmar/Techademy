public class DropdownQuestion implements Question{
    private String question;

    @Override
    public void addQuestion(String question) {
        System.out.println("Creating Dropdown question\n" + question);

    }

}
