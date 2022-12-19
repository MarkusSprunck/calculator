package calculator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
}
