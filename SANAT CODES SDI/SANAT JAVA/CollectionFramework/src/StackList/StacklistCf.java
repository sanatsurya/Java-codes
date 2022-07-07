package StackList;
import java.util.Stack;
public class StacklistCf {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(5);
        s1.push(6);
        s1.push(7);
        s1.push(8);
        s1.push(9);
        s1.pop();
        System.out.println(s1);
    }
}
