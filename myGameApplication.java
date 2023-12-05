package myASpringFrameWork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import myASpringFrameWork.games.SuperContraGame;
@ComponentScan("myASpringFrameWork.games")
public class myGameApplication {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(SuperContraGame.class);
		//var game = new mario();
		var game =new SuperContraGame();
		
		context.getBean(SuperContraGame.class).up();
		context.getBean(SuperContraGame.class).down();
		context.getBean(SuperContraGame.class).left();
		context.getBean(SuperContraGame.class).right();
		

		 //var game =new SuperContraGame();//object creation
		// var gameRunner =new GameRunner(game);
		/*
		 * object creation + wiring of dependencies here (game) is dependency of game
		 * runner
		 */
		// gameRunner.run();

	}
}
