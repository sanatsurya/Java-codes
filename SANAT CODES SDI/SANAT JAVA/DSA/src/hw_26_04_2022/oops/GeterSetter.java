package hw_26_04_2022.oops;
class getset
{
	 // Member variable of this class
    private String name;
 
    // Method 1 - Getter
    public String getName() { return name; }
 
    // Method 2 - Setter
    public void setName(String N)
    {
 
        // This keyword refers to current instance itself
        this.name = N;
    }
}
public class GeterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
		        // Creating an object of class 1 in main() method
			 getset obj = new getset();
		 
		        // Setting the name by calling setter method
		        obj.setName("This name is set by setter method");
		        // Getting the name by calling geter method
		        System.out.println(obj.getName());
		    }

	}

}
