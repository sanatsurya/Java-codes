package SpringBasics;
class A{
	int a=10;
}
class B{
	int a=20;
	void show() {
		
		System.out.println(a + "This is current class variable vlaue");
		System.out.println("This is supper class variable value" + super.a);
	}
}
public class SupperKeyWord {
	public static void main(String[] args) {
		B obj= new B();
		obj.show();
	}
}
