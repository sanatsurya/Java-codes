package hw_26_04_2022.oops;
abstract class Student{
	abstract void Student_Id();
	void branch(){
		System.out.println("This will be hide as you see it's Abstract class");
	}
}
class Sanat extends Student{

	@Override
	void Student_Id() {
		// TODO Auto-generated method stub
		System.out.println("Sanat is height of 6'1 inch");
	}
	
}
class Jyouti extends Student{

	@Override
	void Student_Id() {
		// TODO Auto-generated method stub
		System.out.println("Jyouti is height of 5'5 inch");
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Sanat = new Sanat();
		Sanat.Student_Id();
		Student Jyouti = new Jyouti();
		Jyouti.Student_Id();

	}

}
