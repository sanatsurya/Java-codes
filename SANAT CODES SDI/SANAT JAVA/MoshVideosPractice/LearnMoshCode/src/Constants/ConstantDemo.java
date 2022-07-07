package Constants;

import java.util.Scanner;

public class ConstantDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input num1: ");
        int num1 = sc.nextInt();
        System.out.print("Input num2: ");
        int num2 = sc.nextInt();
        final int sum = num1+num2;
        System.out.println("The sum of two number is " + sum);

    }
}
