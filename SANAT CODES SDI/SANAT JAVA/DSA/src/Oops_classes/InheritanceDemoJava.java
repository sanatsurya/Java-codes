package Oops_classes;
class Shape{
	String Shape;
	String Color;
}
class Circle extends Shape{
	
}
public class InheritanceDemoJava {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.Color = "Blue";
		System.out.println(c1.Color);
	}
}
