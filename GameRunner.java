package myASpringFrameWork.games;

import org.springframework.stereotype.Component;

/*if we want to change Game Runner application from mario to superContra we need to replace 
 mario with super contra  slight code changes:coupling
 less code changes:loose coupling
 more code changes:tight coupling */
@Component
public class GameRunner {
SuperContraGame game;
public GameRunner(SuperContraGame game2) {
	this.game=game2;
}
	
	public void run() {
		System.out.println("Running game");
		game.up();
		game.down();
		game.right();
		game.left();
		
			
	}

}
