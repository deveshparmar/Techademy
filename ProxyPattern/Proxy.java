import java.util.Date;

public class Proxy implements DatabaseExecuter {
    private boolean isAdmin;
    private DatabaseExecuter executer;
    private String username;

    public Proxy(String username, String password) {
        this.username = username;
        // validations for Admin
        if (username.equals("Admin") && password.equals("Admin")) {
            isAdmin = true;
        }
        // create Real object
        executer = new DatabaseExecuterImpl();
    }

    @Override
    public void executeQuery(String queryType) throws Exception {
        // check for admin
        if (isAdmin) {
            executer.executeQuery(queryType);
        } else {
            // check if query type is DELETE and user is not admin
            if (queryType.equals("DELETE")) {
                log(this.username + "  attempted to execute " + queryType + " query at " + new Date());
                throw new Exception("Only Admin can execute the Delete Query");
            }
            executer.executeQuery(queryType);
        }
        log(this.username + " executed " + queryType + " query at " + new Date());
    }

    private void log(String message) {
        System.out.println("Log: " + message);
    }
}
