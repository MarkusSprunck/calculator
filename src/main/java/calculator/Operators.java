package calculator;

public enum Operators {
    ADD("+"),
    SUB("-"),
    MULT("*"),
    DIV("/"),
    DEFAULT("DEFAULT");

    private final String operator;

    Operators(String operator){
        this.operator = operator;
    }

    public static Operators getFromString(String symbol){
        for (Operators value : Operators.values()){
            if (value.operator.equals(symbol)){
                return value;
            }
        }
        return Operators.DEFAULT;
    }
}
