package ControlFlow;

import java.util.Scanner;

public class ComaprisionOperator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 =6;
        boolean result = num1==num2;
        System.out.println(result);
        boolean greater = num1<=num2;
        System.out.println(greater);
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the temperature of your body:- ");
        int temp = sc.nextInt();
        boolean isFever = temp>=28 && temp<=48;
        if(isFever==false){
            System.out.println("You have high body temp . You have fever");
        }
        else {
            System.out.println("You are good no issue");
        }
    }
}
