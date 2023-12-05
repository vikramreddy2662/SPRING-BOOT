package myASpringFrameWork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
record move(String name,int num){};
public class gamingConsole {
	@Bean
	public move move1() {
		return new move("UP",5);
	}
	}
