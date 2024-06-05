public class ValueExpression implements Expression{

    private final String value;

    public ValueExpression(String value) {
        this.value = value;
    }

    @Override
    public boolean interpret(Context context) {
        return value.equals(context.getVariableValue("value"));
    }
}
