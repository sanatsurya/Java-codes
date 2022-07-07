package TeluskoJava;

public class Pyramid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=10;
		for(int i=1; i<=row; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
