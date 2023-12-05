package myASpringFrameWork.games;

import org.springframework.stereotype.Component;

@Component
public class mario {

	public void up() {
		System.out.println("jump");
		
	}

	public void down() {
		System.out.println("lie down");
		
	}

	public void right() {
		System.out.println("move front");
		
	}

	public void left() {
	  System.out.println("move left");
		
	}

}
