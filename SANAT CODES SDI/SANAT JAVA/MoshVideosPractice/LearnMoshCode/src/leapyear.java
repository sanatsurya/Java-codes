import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the years: ");
        int Leapyear = sc.nextInt();
        if(Leapyear%4==0){
            System.out.println("This is leap year");
        }else {
            System.out.println("This is not a leap year");
        }
    }
}
