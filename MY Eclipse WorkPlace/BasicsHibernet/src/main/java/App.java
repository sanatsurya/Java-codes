import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HibernetQuery.User;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		//Transaction transaction = session.beginTransaction();
		//Database related stuffs
		
//		User user= new User();
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Input name:");
//		user.setName(scanner.nextLine());
//		System.out.print("Input email");
//		user.setEmail(scanner.nextLine());
//		System.out.print("Input Password");
//		user.setPassword(scanner.nextLine());
//		scanner.close();
//		session.save(user);
		
		//Hibernet Fetch Query
		
		//transaction.commit();
		try {
			List<User> users = session.createQuery("from user_table").getResultList();
			for(User u:users) {
				System.out.println(u);
			}
			
		}catch (Exception e) {
			
		}
		//System.out.println("Inserted success full");
		session.close();
		factory.close();

	}

}
