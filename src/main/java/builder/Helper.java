package builder;

import java.util.*;

import static java.util.Collections.frequency;

public class Helper {
    public final static Map<String, Integer> operators = new HashMap<>(Map.of("/", 1, "*", 2,"-", 3,"+",4));

    public static Integer operatorCount(List<String> values){
        Integer count = 0;
        for (String value : values){
            if (value.equals("+") || value.equals("-") ||value.equals("/") ||value.equals("*")){
                count ++;
            }
        }
        return count;
    }

    public static List<String> calculationCorrector(List<String> calculation){
        List<String> newCalculation;
        if (frequency(calculation, "(") > frequency(calculation, ")")){
            newCalculation = calculation.subList(1, calculation.size());
            return calculationCorrector(newCalculation);
        }else if (frequency(calculation, "(") < frequency(calculation, ")")){
            newCalculation = calculation.subList(0, calculation.size()-1);
            return calculationCorrector(newCalculation);
        }else {
            return calculation;
        }
    }

    public static List<String> removeBrackets(List<String> values){
        List<String> newValues = new ArrayList<>();
        for (String value : values){
            if (!value.equals("(") && !value.equals(")")){
                newValues.add(value);
            }
        }
        return newValues;
    }

    public static List<Integer> getNodeDepth(List<String> values){
        List<Integer> nodeDepth = new ArrayList<>();

        int level = 0;
        for (String value : values){
            if (value.equals("(")){
                level ++;
                nodeDepth.add(-1);
            } else if (value.equals(")")) {
                nodeDepth.add(-1);
                level --;
            }else{
                nodeDepth.add(level);
            }
        }
        System.out.println("level should now be 0. Level = " + level);
        return nodeDepth;
    }

    public static Integer getRootIndex(List<Integer> nodeDepth, List<String> values){
        Integer rootIndex = 0;

        int minDepth = getMinDepth(nodeDepth);

        for (int i = 0; i < nodeDepth.size(); i++) {
            if (nodeDepth.get(i) == minDepth && operators.containsKey(values.get(i))) {
                if (rootIndex == 0) {
                    rootIndex = i;
                } else {
                    if (operators.get(values.get(i)) > operators.get(values.get(rootIndex))){
                        rootIndex = i;
                    }
                }
            }
        }
        return rootIndex;
    }

    public static Integer getMinDepth(List<Integer> nodeDepth){
        Integer minDepth = null;

        for (Integer depth : nodeDepth){
            if (depth != -1){
                if (minDepth == null){
                    minDepth = depth;
                }else if (depth < minDepth){
                    minDepth = depth;
                }
            }
        }
        return minDepth;
    }

    public static String[] insertItemArray(String arr[], int index, String newValue) {
        String[] newArray = new String[arr.length - 2];
        int j = 0;
        for (int i = 0; i < arr.length; i++){
            if (i == index){
                newArray[j] = newValue;
                i += 2;
            }else{
                newArray[j] = arr[i];
            }
            j++;
        }
        return newArray;
    }
}
