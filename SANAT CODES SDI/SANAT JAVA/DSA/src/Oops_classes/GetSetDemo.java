package Oops_classes;
class Account{
	int Account_No;
	private String Password;
	public String GtPass(){
		return this.Password;
	}
	public void SetPass(String pw) {
		this.Password = pw;
	}
}
public class GetSetDemo {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.SetPass("HariOmm");
		System.out.println(a1.GtPass());
	}

}
