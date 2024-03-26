public class App {
    public static void main(String[] args) throws Exception {
        
        DatabaseExecuter admin = new Proxy("Admin", "Admin");
        admin.executeQuery("CREATE");
        admin.executeQuery("UPDATE");
        admin.executeQuery("DELETE");

        DatabaseExecuter user = new Proxy("user", "123");
        user.executeQuery("UPDATE");
        user.executeQuery("CREATE"); 

        DatabaseExecuter user2 = new Proxy("user2", "456");
        user2.executeQuery("DELETE");// throws error as it has limited privilages
    }
}
