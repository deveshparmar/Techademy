public class BlankAnswer implements Answer{

    private String answer;

    @Override
    public void addAnswer(String answer) {
        System.out.println("Creating Blank answer\n" + answer);
    }
}
