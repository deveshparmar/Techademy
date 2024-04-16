public class DropdownAnswer implements Answer{

    private String answer;

    @Override
    public void addAnswer(String answer) {
        System.out.println("Creating Dropdown answer\n" + answer);
    }
}
