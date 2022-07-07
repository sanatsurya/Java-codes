package array.list_1d_2d_md;

public class Array_Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1[] = new int[12];// Here new key word is used to create object in class or allocate memory
		int count = 1;
		for (int i = 0; i < s1.length; i++) {
			s1[i] = count;
			count++;
			// System.out.print(s1[i] +" ");//This is for input
		}
		for (int j = 0; j < s1.length; j++) {
			System.out.println(s1[j] + ""); // This loop is for print while input
		}

	}

}
