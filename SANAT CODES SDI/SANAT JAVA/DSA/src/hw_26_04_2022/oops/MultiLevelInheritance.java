package hw_26_04_2022.oops;
class Car{
	public Car(){
		System.out.println("This is a car");
	}
}
class Harrier extends Car{
	public Harrier() {
		System.out.println("Hp:1550, Top speed: 180, 0-100: 4second");
	}
	public void brand() {
		System.out.println("This is from iconic tata brand");
	}
	public void Price() {
		System.out.println("This car is price about 25 lakh");
	}
}
class VolksWagen extends Harrier{
	public VolksWagen() {
		System.out.println("Hp:2450, Top speed: 240, 0-100: 2 second");
	}
	//Overriding
	//This will over riding previous one
	public void brand() {
		System.out.println("This from VolksWagen Groups");
	}
	public void Price() {
		System.out.println("This car is 80 lakh rupees");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VolksWagen Firstcar = new VolksWagen();
		Firstcar.brand();
		Firstcar.Price();
		
	}

}
