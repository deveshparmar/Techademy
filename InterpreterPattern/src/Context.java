import java.util.Map;

public class Context {
    private final Map<String,String> variables;

    public Context(Map<String, String> variables) {
        this.variables = variables;
    }
    public String getVariableValue(String key) {
        return variables.get(key);
    }
}
