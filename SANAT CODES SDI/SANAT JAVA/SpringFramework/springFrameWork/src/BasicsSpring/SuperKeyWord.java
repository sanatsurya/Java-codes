package BasicsSpring;
class A{
    int a=5;
    public void view(){
        System.out.println("This is the parent class method");
    }
    A(){
        System.out.println("This is a class constructor");
    }
}
class B extends A{
    B(){
        System.out.println("This is b class constructor");
    }
    int a=90;

    public void Show(){
        System.out.println(a +" This is current variable value");
        System.out.println(super.a+" This will initiate the supper key value");
    }
    public void view(){
        System.out.println("This is child class methord");
        super.view();
    }
}
public class SuperKeyWord {
    public static void main(String[] args) {
        B obj = new B();
        obj.Show();
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        obj.view();
    }
}
