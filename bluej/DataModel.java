
public class DataModel {
    private Operators operator;
    private Long numberOne = null;
    private Long numberTwo = null;

    public boolean isValid() {
        return this.numberOne != null && this.numberTwo != null && !this.operator.equals(Operators.DEFAULT);
    }

    public void setNumberOne(String value) throws NumberFormatException {
        this.numberOne = Long.valueOf(Integer.parseInt(value));
    }

    public void setNumberTwo(String value) throws NumberFormatException {
        this.numberTwo = Long.valueOf(Integer.parseInt(value));
    }

    public Operators getOperator() {
        return this.operator;
    }

    public Long getNumberOne() {
        return this.numberOne;
    }

    public Long getNumberTwo() {
        return this.numberTwo;
    }

    public void setOperator(Operators operator) {
        this.operator = operator;
    }

}
