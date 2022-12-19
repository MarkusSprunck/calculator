package builder;

import calculator.Calculator;
import java.util.*;

public class TreeAlgos {
    public final static Map<String, Integer> operators = new HashMap<>(Map.of("/", 1, "*", 2,"-", 3,"+",4));

    public static void main(String[] args){
        String calculation = "( 7 - 3 ) + 2 * ( 5 * ( 3 + 6 ) ) + 2"; //96

        System.out.println("Final Result : " + run(calculation));
    }


    public static String run(String calculation){
        String[] values = calculationHierarchy(calculation).trim().split(" ");
        String[] finalResult = parseReformattedCalculation(values);
        return finalResult[0];
    }


    public static String calculationHierarchy(String calculation){
        String[] valuesArray = calculation.split(" ");

        List<String> values = new ArrayList<>(List.of(valuesArray));

        List<Integer> nodeDepth = Helper.getNodeDepth(values);

        Integer rootIndex = Helper.getRootIndex(nodeDepth, values);

        System.out.println("Root index : " + rootIndex + "\nRoot node : " + values.get(rootIndex));
        Node<String> root = new Node<>(values.get(rootIndex));

        List<String> firstHalf = values.subList(0, rootIndex);
        List<String> secondHalf = values.subList(rootIndex + 1, values.size());

        buildTreeFromRoot(root, Helper.calculationCorrector(firstHalf));
        buildTreeFromRoot(root, Helper.calculationCorrector(secondHalf));

       return traversalCalculation(root, "");
    }


    public static void buildTreeFromRoot(Node<String> parent, List<String> values){
        if (Helper.operatorCount(values) > 0){
            List<Integer> nodeDepth = Helper.getNodeDepth(values);
            Integer rootIndex = Helper.getRootIndex(nodeDepth, values);

            parent.addChild(new Node<>(values.get(rootIndex)));
            System.out.println("Operator node added. Index : " + rootIndex + "  -  Value : " + values.get(rootIndex) + " - Parent : " + parent.getData());

            List<String> firstHalf = values.subList(0, rootIndex);
            List<String> secondHalf = values.subList(rootIndex + 1, values.size());

            int parentIndex = parent.getChildren().size() - 1;

            buildTreeFromRoot(parent.getChildren().get(parentIndex), Helper.calculationCorrector(firstHalf));
            buildTreeFromRoot(parent.getChildren().get(parentIndex), Helper.calculationCorrector(secondHalf));

        }else{
            parent.addChild(new Node<>(Helper.removeBrackets(values).get(0)));
            System.out.println("Number node added. Value : " + Helper.removeBrackets(values).get(0) + " - Parent : " + parent.getData());
        }
    }


    public static String traversalCalculation(Node<String> root, String calculation) {
        calculation = calculation + " " + root.getData();

        try { calculation  = traversalCalculation(root.getChildren().get(0), calculation);
        } catch (IndexOutOfBoundsException ignored) {}

        try { calculation =  traversalCalculation(root.getChildren().get(1), calculation);
        } catch (IndexOutOfBoundsException ignored) {}

        return calculation;
    }


    public static String[] parseReformattedCalculation(String[] calculation){
        if (calculation.length == 1){
            return calculation;
        }
        String[] result = {};
        for (int i = calculation.length - 1 ; i > - 1 ; i--){
            if (operators.containsKey(calculation[i])){
                String subCalculation = calculation[i] + " " + calculation[i+1] + " " + calculation[i+2];
                String newValue = Calculator.run(subCalculation);
                result = Helper.insertItemArray(calculation, i, newValue);
                return parseReformattedCalculation(result);
            }
        }
        return result;
    }
}
