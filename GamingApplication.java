package myASpringFrameWork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GamingApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(gamingConsole.class)) {

			System.out.println(context.getBean("move1"));

		}

		// var game =new mario();
		// var game =new SuperContraGame();//object creation
		// var gameRunner =new GameRunner(game);
		/*
		 * object creation + wiring of dependencies here (game) is dependency of game
		 * runner
		 */
		// gameRunner.run();

	}

}
