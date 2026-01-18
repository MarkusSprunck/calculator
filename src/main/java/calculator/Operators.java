package calculator;

public enum Operators {
    ADD("+"),
    SUB("-"),
    MULT("*"),
    DIV("/");

    private final String operator;

    Operators(String operator){
        this.operator = operator;
    }

    public static Operators fromString(String symbol){
        for (Operators operator : Operators.values()){
            if (operator.operator.equals(symbol)){
                return operator;
            }
        }
        return null;
    }
}
