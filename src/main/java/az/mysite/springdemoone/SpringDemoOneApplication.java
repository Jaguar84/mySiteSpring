package az.mysite.springdemoone;

import az.mysite.springdemoone.beans.Computer;
import az.mysite.springdemoone.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoOneApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringDemoOneApplication.class, args);

		Student s=context.getBean(Student.class);
		System.out.println(s.name);

		Computer c=context.getBean(Computer.class);
		System.out.println(c.model);
		System.out.println(c.ram.brand);

		MyConfig config=context.getBean(MyConfig.class);
		System.out.println(config.getMyName());
//		for (String beaName: context.getBeanDefinitionNames()){
//			System.out.println(beaName);
//		}
	}

}
