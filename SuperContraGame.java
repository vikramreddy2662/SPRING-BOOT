package myASpringFrameWork.games;

import org.springframework.stereotype.Component;

/*coupling:how much work is involved in changing something.*/
@Component
public class SuperContraGame {
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
