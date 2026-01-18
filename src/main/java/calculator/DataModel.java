package calculator;

import lombok.Getter;
import lombok.Setter;

@Getter
public class DataModel {
    @Setter
    private Operators operator;
    private Long numberOne = null;
    private Long numberTwo = null;

    public boolean isValid() {
        return this.numberOne != null && this.numberTwo != null && this.operator != null;
    }

    public void setNumberOne(String value) throws NumberFormatException {
        this.numberOne = Long.parseLong(value);
    }

    public void setNumberTwo(String value) throws NumberFormatException {
        this.numberTwo = Long.parseLong(value);
    }

}
