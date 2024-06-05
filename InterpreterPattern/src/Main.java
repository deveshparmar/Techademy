import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Expression query = new AndExpression(
                new ValueExpression("name"),
                new OrExpression(
                        new ValueExpression("Devesh"),
                        new ValueExpression("Parmar"))
        );

        Map<String,String>variables = new HashMap<>();
        variables.put("name","Devesh");
        Context context = new Context(variables);

        boolean result = query.interpret(context);

        if (result){
            System.out.println("Query matched");
        }else{
            System.out.println("Query didnt matched");
        }
    }
}