package myASpringFrameWork;

import java.util.Arrays;

//import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration	
record Person(String name,int age,double salary,Address address) {};
record Address(String street,int colonyno) {};
public class SpringAnnotationConfiguration {
	@Bean
	public String name() {
		return "vikas reddy";
	}
	@Bean
	public int age() {
		return 32;
	}

	@Bean
	public double Salary() {
		return 200000;}

	@Bean
	public Person person() {
	return new Person("vikas",21,300000,new Address("motinagar",45)); 
	}
	@Bean
	@Primary		
	public Person PersonMethodCall() {
		return new Person(name(),age(),Salary(),address());
		
	}
	@Bean
	public Person Parameters(String name,int age,double salary,Address address) {
		return new Person(name,age,salary,address);
	}
	/*we cannot access this bean using address instead address2 
	should be used.*/
	@Bean(name="address2")
	//@Qualifier("Qualifier3address")
	public Address  address() {
		return new Address("balgangadhar tilak",2);}
	


	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(SpringAnnotationConfiguration.class)) {
			/* Application context->spring container=>used to manage&control SpringBeans */
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			// System.out.println(context.getBean("address"));
			System.out.println(context.getBean("address2"));
			// System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean("PersonMethodCall"));
			System.out.println(context.getBean("Parameters"));
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		    // listing of all beans.
		}
	}
}
