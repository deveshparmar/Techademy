public class VariableExpression implements Expression{

    private final String variableName;

    public VariableExpression(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public boolean interpret(Context context) {
        String value = context.getVariableValue(variableName);
        return value !=null;
    }
}
