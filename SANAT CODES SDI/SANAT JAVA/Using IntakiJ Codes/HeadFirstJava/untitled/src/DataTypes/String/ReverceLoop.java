package DataTypes.String;

import java.util.Scanner;

public class ReverceLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give your name");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("After reverse the string");
        for(int i=name.length()-1; i>=0; i--){
            System.out.print(name.charAt(i));
        }
    }
}
