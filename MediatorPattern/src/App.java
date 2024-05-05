public class App {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new User("User1", mediator);
        User user2 = new User("User2", mediator);
        User user3 = new User("User3", mediator);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.sendMessage("Hello from User1!");
        user2.sendMessage("Hi, User2 here!");
    }
}
