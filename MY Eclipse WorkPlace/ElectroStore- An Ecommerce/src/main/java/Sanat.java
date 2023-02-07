import java.util.Scanner;

public class Sanat {

	public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int sum1=n1+n2;
        int sum2= n2+n3;
        int sum3 =n3+n1;
        if(sum1>0 && sum1%2==0){
            System.out.println("YES");
        }else if(sum2>0 && sum2%2==0){
            System.out.println("YES");
        }else if(sum3>0 && sum3%2==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

}
