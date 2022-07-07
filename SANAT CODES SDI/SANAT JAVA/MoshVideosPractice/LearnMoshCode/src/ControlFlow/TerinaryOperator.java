package ControlFlow;

public class TerinaryOperator {
    public static void main(String[] args) {
        int bankBalance = 25000;
        // First condtion is true the first statement is executed or if false second one is executed
        String status = bankBalance> 27000 ? "rich": "poor";
        System.out.println(status);
    }
}
