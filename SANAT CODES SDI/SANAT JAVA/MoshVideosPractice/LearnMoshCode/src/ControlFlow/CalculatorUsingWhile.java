package ControlFlow;

import java.util.Scanner;
interface Calculation{
    int sum(int x, int y);
    int sub(int x, int y);
    int mul(int x, int y);
    int div(int x, int y);
}
class Calculator implements Calculation{

    @Override
    public int sum(int x, int y) {
        return x+y;
    }

    @Override
    public int sub(int x, int y) {
        return x-y;
    }

    @Override
    public int mul(int x, int y) {
        return x*y;
    }

    @Override
    public int div(int x, int y) {
        return x/y;
    }
}
public class CalculatorUsingWhile extends Calculator{
    public static void main(String[] args) {
        Calculator cl = new Calculator();
        Scanner sc = new Scanner(System.in);
        String input ="";
        while (input!="close"){
            StringBuilder sr = new StringBuilder("name");
            String name = new String();
            System.out.print("ENTER A NUMBER : ");
            int x = sc.nextInt();
            System.out.println("ENTER AN OPERATOR: ");
            input = sc.next();
            System.out.println("Enter an Number");
            int y = sc.nextInt();
            if(input.equals("+")){
                System.out.println(cl.sum(x,y));
                return;
            }else if(input.equals("-")){
                System.out.println(cl.sub(x,y));
                return;
            }
            else if(input.equals("*")){
                System.out.println(cl.mul(x,y));
                return;
            }
            else if(input.equals("/")){
                System.out.println(cl.div(x,y));
                return;
            }else {
                System.out.println("Sequence miss match please enter once again");
            }

        }
    }
}
