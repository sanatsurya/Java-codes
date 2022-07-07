package Oops_classes;
class Teacher{
	int teacher_id;
	String teacher_name;
	String teacher_sub;
	int teach_numb;
	
	public void PrintTech() {
		System.out.println("The Id of teacher is " + this.teacher_id);
		System.out.println("The Name of teacher is " + this.teacher_name);
		System.out.println("The Teachers Sub is " + this.teacher_sub);
		System.out.println("The Teacher number is " + this.teach_numb);
	}
	public void Printme() {
		
	}
	Teacher(int id, String name, String sub, int num){
		this.teacher_id = id;
		this.teacher_name= name;
		this.teacher_sub = sub;
		this.teach_numb = num;
	}
	//This is known as para meterised constructor
}
public class ParameterConstructor2 {
	public static void main(String [] args) {
		Teacher Tech1 = new Teacher(1, "Sangam sir", "Programing in cpp", 874568754);
		Teacher Tech2 = new Teacher(2, "Jyouti ranjan", "Programing in core java", 8455552);
		Tech1.PrintTech();
		Tech2.PrintTech();
	}
}
