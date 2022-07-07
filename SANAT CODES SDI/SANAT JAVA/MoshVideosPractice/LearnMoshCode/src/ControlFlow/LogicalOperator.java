package ControlFlow;

public class LogicalOperator {
    public static void main(String[] args) {
        //This is or operator
        boolean isHighStatus = true;
        boolean isHighIncome = true;
        boolean hasCriminalRecord = false;
        boolean availableForLoan = (isHighIncome||isHighStatus)&&!hasCriminalRecord;
        System.out.println(availableForLoan);
    }
}
