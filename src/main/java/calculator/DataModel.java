package calculator;

public class DataModel {
    private Operators operator;
    private Long numberOne = null;
    private Long numberTwo = null;

    public boolean isValid() {
        return this.numberOne != null && this.numberTwo != null && this.operator != null && !this.operator.equals(Operators.DEFAULT);
    }

    public void setNumberOne(String value) throws NumberFormatException {
        this.numberOne = Long.parseLong(value);
    }

    public void setNumberTwo(String value) throws NumberFormatException {
        this.numberTwo = Long.parseLong(value);
    }

    public Operators getOperator() {
        return this.operator;
    }

    public void setOperator(Operators operator) {
        this.operator = operator;
    }

    public Long getNumberOne() {
        return this.numberOne;
    }

    public Long getNumberTwo() {
        return this.numberTwo;
    }

}
