public class DatabaseExecuterImpl implements DatabaseExecuter {

    @Override
    public void executeQuery(String queryType) {
        System.out.println("Executing the " + queryType + " query in DB");
    }

}
