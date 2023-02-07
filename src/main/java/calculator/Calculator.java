package calculator;

import java.util.Locale;

public class Calculator {

    public static final String INVALID_INPUT = "INVALID_INPUT";

    public static String run(String calculation) {
        DataModel dataModel = parse(calculation);
        if (dataModel.isValid()) {
            return calculate(dataModel);
        }
        return INVALID_INPUT;
    }

    private static String calculate(DataModel dataModel) {
        String result = INVALID_INPUT;
        switch (dataModel.getOperator()) {
            case ADD -> result = addition(dataModel);
            case SUB -> result = subtraction(dataModel);
            case MULT -> result = multiplication(dataModel);
            case DIV -> result = division(dataModel);
        }
        return result;
    }

    private static DataModel parse(String calculation) {
        DataModel dataModel = new DataModel();
        if (calculation != null) {
            String[] values = calculation.trim().replace("  ", " ").split(" ");
            if (values.length == 3) {
                try {
                    dataModel.setOperator(Operators.getFromString(values[1]));
                    dataModel.setNumberOne(values[0]);
                    dataModel.setNumberTwo(values[2]);
                } catch (IllegalArgumentException ignored) {
                    // nothing to do
                }
            }
        }
        return dataModel;
    }

    private static String addition(DataModel dataModel) {
        return "" + (dataModel.getNumberOne() + dataModel.getNumberTwo());
    }

    private static String subtraction(DataModel dataModel) {
        return "" + (dataModel.getNumberOne() - dataModel.getNumberTwo());
    }

    private static String multiplication(DataModel dataModel) {
        return "" + (dataModel.getNumberOne() * dataModel.getNumberTwo());
    }

    private static String division(DataModel dataModel) {
        if (dataModel.getNumberTwo() == 0) {
            return "ERROR";
        }
        return String.format(Locale.UK,"%.3f", (double) dataModel.getNumberOne() / dataModel.getNumberTwo());
    }
}
