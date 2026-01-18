package calculator;

import java.util.Locale;
import java.util.Optional;

public class Calculator {

    public static String run(String input) {
        return parse(input)
                .filter(DataModel::isValid)
                .map(Calculator::calculate)
                .orElse("INVALID_INPUT");
    }

    private static String calculate(DataModel dataModel) {
        return switch (dataModel.getOperator()) {
            case ADD -> addition(dataModel);
            case SUB -> subtraction(dataModel);
            case MULT -> multiplication(dataModel);
            case DIV -> division(dataModel);
        };
    }

    private static Optional<DataModel> parse(String calculation) {
        DataModel dataModel = new DataModel();
        if (calculation != null) {
            String[] values = calculation.trim().replace("  ", " ").split(" ");
            if (values.length == 3) {
                try {
                    dataModel.setOperator(Operators.fromString(values[1]));
                    dataModel.setNumberOne(values[0]);
                    dataModel.setNumberTwo(values[2]);
                } catch (IllegalArgumentException ignored) {
                    // nothing to do
                }
            }
        }
        return Optional.of(dataModel);
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
