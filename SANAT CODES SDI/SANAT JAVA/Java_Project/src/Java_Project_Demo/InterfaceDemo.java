package Java_Project_Demo;
class Father{
	public Father() {
		System.out.println("Line one");
	}
	public void InheritOne() {
		System.out.println("Line two");
	}
}
class Child extends Father{
	public Child() {
		System.out.println("Line three");
	}
	//This will override previous methord
	public void Inherit() {
		System.out.println("Line four");
	}
}
class Child2 extends Child{
	public void Inherit() {
		System.out.println("Line five");
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		Child s = new Child();
		s.Inherit();
	}
}
