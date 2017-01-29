package exercise2;
/**
 * Waynell Lovell
 */
import java.util.Random;

import exercise2.MagicBall.Messages;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MagicBall ball=new MagicBall(5,"red");
		System.out.println(ball.ToString());
		pickUpTheBall();
	}

	private static void shakeTheBall() {
		Random rand = new Random();
		
		int random=rand.nextInt(5);
		
		switch (random) {
		case 0:
			System.out.println(Messages.ONE);
			break;
		case 1:
			System.out.println(Messages.TWO);
			break;
		case 2:
			System.out.println(Messages.THREE);
			break;
		case 3:
			System.out.println(Messages.FOUR);
			break;
		case 4:
			System.out.println(Messages.FIVE);
			break;
		case 5:
			System.out.println(Messages.SIX);
			break;
		default:
			break;
		}
	}

	private static void pickUpTheBall() {
		// TODO Auto-generated method stub
		System.out.println(MagicBall.GREETING_MESSAGE);
		shakeTheBall();
	}

}
