/* @author: Devesh Parmar */
/* Demonstrating Singleton Pattern with example of Database Connection */

package SingletonPattern;
public class DatabaseConnection {
    private static DatabaseConnection instance;

    /* Making Constructor private to prevent its instantiation outside class */
    private DatabaseConnection(){
    }

    /* Get instance method for gettting current instance */
    public static DatabaseConnection getInstance(){
        if(instance==null){
            instance = new DatabaseConnection();   // instance is only created if not present
        }
        return instance;
    }

    /* Driver Code */
    public static void main(String[] args) {
        DatabaseConnection instance1 = DatabaseConnection.getInstance();
        System.out.println(instance1.hashCode());

        DatabaseConnection instance2 = DatabaseConnection.getInstance();
        System.out.println(instance2.hashCode());

        /*
            Here the hashcode for both the instance will be same beacuse same instance is initialized  every time as it
            is checking if instance is present then return same instance and create new instance only if instance is null
        */
    }
}