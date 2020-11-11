package com.csmithswim;
import java.util.Arrays;

public class Main {
    public static int calculate(String input) {
        String[] result = input.split(" ");
        String operand = result[1];

        switch (operand) {
            case "+":
                Integer sum = Integer.parseInt(result[0]) + Integer.parseInt(result[2]);
                System.out.println(sum);
                break;

            case "-":
                Integer difference = Integer.parseInt(result[0]) - Integer.parseInt(result[2]);
                System.out.println(difference);
                break;

            case "/":
                Integer quotient = Integer.parseInt(result[0]) / Integer.parseInt(result[2]);
                System.out.println(quotient);
                break;

            case "*":
                Integer product = Integer.parseInt(result[0]) * Integer.parseInt(result[2]);
                System.out.println(product);
                break;
        }



//        if (operand.equals("+")) {
//            Integer sum = Integer.parseInt(result[0]) + Integer.parseInt(result[2]);
//            System.out.println(sum);
//        } else if (operand.equals("-")) {
//            Integer difference = Integer.parseInt(result[0]) - Integer.parseInt(result[2]);
//            System.out.println(difference);
//        } else if (operand.equals("/")) {
//            Integer quotient = Integer.parseInt(result[0]) - Integer.parseInt(result[2]);
//            System.out.println(quotient);
//
//        } else if (operand.equals("*")) {
//            Integer product = Integer.parseInt(result[0]) * Integer.parseInt(result[2]);
//            System.out.println(product);
//        }
        return 0;
    }

    public static void main(String[] args) {

    calculate("20 * 2");
    }
}
