package ControlFlow;

import java.util.Scanner;

public class TerinaryOperator {
    public static void main(String[] args) {
//        int bankBalance = 25000;
//        // First condtion is true the first statement is executed or if false second one is executed
//        String status = bankBalance> 27000 ? "rich": "poor";
//        System.out.println(status);
        System.out.print("Please input your Annual Income: ");
        long tax,taxvar = 0;
        String name ="sanat";
        Scanner sc = new Scanner(System.in);
        Long anualIncome = sc.nextLong();
        String tax_details = anualIncome > 100000 ? "taxpayer": "non_taxpayer";
        if (tax_details.equals("taxpayer")){
            if (anualIncome>=100000&& anualIncome<=2000000){
                taxvar = anualIncome * 18/100;
                tax = anualIncome- taxvar;
                System.out.println("The taxable amount is "+ taxvar);
                System.out.println("Your balance after payment of tax is " + tax);
            } else if (anualIncome>2000000) {
                taxvar = anualIncome * 30/100;
                tax = anualIncome- taxvar;
                System.out.println("The taxable amount is "+ taxvar);
                System.out.println("Your balance after payment of tax is"+ tax);
            }
        }else {
            System.out.println("You have to pay nothing as you are not eligible for payment of tax");
        }
    }
}
