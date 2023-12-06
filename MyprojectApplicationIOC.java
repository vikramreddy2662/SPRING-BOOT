package inversion_control.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MyprojectApplicationIOC {

	public static void main(String[] args) {
		//Spring container(ApplicationContext)
		var context=new AnnotationConfigApplicationContext(MobileConfig.class);
		
		Mobiles m=(Mobiles)context.getBean("getOnePlusObject",Mobiles.class);
		m.modelAndVersion();
		m.price();
		}
	}
