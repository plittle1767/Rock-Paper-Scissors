package a8;

import java.util.Random;

// Choose one enum from RPS randomly. See the lecture on enums 
// for an example of choosing a random item from an enum.
// RPS is defined in RPS.java.
public class RandomOpponent implements Opponent {

	/**
	 * this method gets the random choice of the computer
	 * 
	 * @param the humans move
	 * @return the random choice of the computer
	 */
	@Override
	public RPS getResponse(RPS humanMove) {
		Random generator = new Random();
		int value = generator.nextInt(3);
		return RPS.values()[value];
	}

}
