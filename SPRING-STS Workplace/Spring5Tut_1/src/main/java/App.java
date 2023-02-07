import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Dependency.study.Car.Fortuner;
import com.Dependency.study.Car.Harrier;
import com.Dependency.studyInterfaces.CarI;

public class App {

	public static void main(String[] args) {
//		CarI car1 = new Harrier();
//		CarI car2 = new Fortuner();
//		System.out.println(car1.company());
//		System.out.println(car2.company());
		 AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(AppConfig.class);
//		 CarI mycar=config.getBean(CarI.class);
		 CarI mycar=config.getBean("harrier",CarI.class);
		 System.out.println(mycar.company());
		 
		 config.close();
	}

}
