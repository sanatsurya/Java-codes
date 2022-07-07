package Oops_classes;

class Player{
	String PlayerName;
	int PlayerId;
	
	public void PrintInfo(String PlayeName) {
		System.out.println(this.PlayerName);
	}
	public void PrintInfo(int PlayerId) {
		System.out.println(this.PlayerId);
	}
	public void PrintInfo(String PlayerName, int PlayerId) {
		System.out.println(this.PlayerName + this.PlayerId);
	}
}
public class PolymerposimDemo {
	public static void main(String[] args) {
		Player p1 = new Player();
		p1.PlayerName= "Dhoni";
		p1.PlayerId =06;
		p1.PrintInfo(PlayerId);
	}

}
