package hw_26_04_2022.oops;
class Creator1{
	void methodOne(){
		System.out.println("This is by creator one");
	}
}
class Creator2{
	void MethodOne() {
		System.out.println("This is by creator two");
	}
}
class Creation extends Creator1, Creator2{
	
}
public class MultilableInheritance {
	public static void main(String[] args) {
		Creation c = new Creation();
		c.methodOne();
	}
}
//This will show comilation error as The two methods having same singnature so comilor
//get confuse whom to give priority to which methord