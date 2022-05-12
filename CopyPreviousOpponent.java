package a8;

//Choose the move made by a player the previous round. Start with RPS.ROCK 
// for the first move, or when first changing to this opponent.
//RPS is defined in RPS.java.
public class CopyPreviousOpponent implements Opponent {

	private RPS copyMove;

	/**
	 * This will make the Copy Previous opponent start each game with rock before it
	 * starts copying
	 */
	public CopyPreviousOpponent() {
		copyMove = RPS.ROCK;
	}

	/**
	 * This is where the opponent will copy the previous move of the human
	 * 
	 * @param humanMove what the human chose the previous round
	 * @return the previous move of the human
	 */
	@Override
	public RPS getResponse(RPS humanMove) {
		RPS previous = copyMove;
		copyMove = humanMove;
		return previous;
	}
}