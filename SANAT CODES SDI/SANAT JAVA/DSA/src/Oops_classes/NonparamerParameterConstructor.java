package Oops_classes;
class Vehicles{
	String veh_name;
	String veh_typ;
	int veh_whelr;
	String veh_color;
	
	Vehicles(String vn , String vt, int Vw, String Vc){
		System.out.println("This is an example of color eassy");
		
		this.veh_name = vn;
		this.veh_typ = vt;
		this.veh_whelr = Vw;
		this.veh_color = Vc;
	}
	public void Printveh() {
		System.out.println(this.veh_typ);
		System.out.println(this.veh_whelr);
		System.out.println(this.veh_color);
	}
}
public class NonparamerParameterConstructor {
	public static void main(String [] args) {
		Vehicles veh1 = new Vehicles("Mercidese Benz", "Fourwheelwr", 578455, "Navy Blue");
		veh1.Printveh();
	}
}
