import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.Dependency.study.Car.Fortuner;
import com.Dependency.study.Car.Harrier;
import com.Dependency.study.Car.V6;
import com.Dependency.study.Car.V8;
import com.Dependency.studyInterfaces.Engine;

@Configuration
@ComponentScan("com.Dependency")
public class AppConfig {
	@Bean
		public Harrier harrier() {
			return new Harrier();
		}
	@Bean
		public Fortuner fortuner() {
			return new Fortuner();
		}
	@Bean("V8engine")
		public V8 v8() {
			return new V8();
		}
	@Bean("V6engine")
		public V6 v6() {
			return new V6();
		}
}
