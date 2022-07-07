package TeluskoJava;

class Father{
	int x;
	int y;
	
	public  Father() {
		x=8;
		y=9;
	}
	public Father(int i) {
		x=i;
		y=i;
	}
	public Father(double d) {
		x=(int)d;
		
	}
}
public class Constructor {
	public static void main(String[] args) {
		Father obj = new Father();
		System.out.println(obj.x);
	}
}
