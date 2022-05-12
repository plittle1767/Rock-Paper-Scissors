package a8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BattleTest {

	@Test
	void testPickWinnerTie() {
		Battle test = new Battle();

		assertEquals("tie", test.pickWinner(RPS.ROCK, RPS.ROCK), "Test failed. Expected tie but got");
		assertEquals("tie", test.pickWinner(RPS.PAPER, RPS.PAPER), "Test failed. Expected tie but got");
		assertEquals("tie", test.pickWinner(RPS.SCISSORS, RPS.SCISSORS), "Test failed. Expected tie but got");
	}

	@Test
	void testPickWinnerHuman() {
		Battle test = new Battle();

		assertEquals("human", test.pickWinner(RPS.PAPER, RPS.ROCK),
				"Test failed. Expected human but got " + test.pickWinner(RPS.PAPER, RPS.ROCK));
		assertEquals("human", test.pickWinner(RPS.SCISSORS, RPS.PAPER),
				"Test failed. Expected human but got " + test.pickWinner(RPS.SCISSORS, RPS.PAPER));
		assertEquals("human", test.pickWinner(RPS.ROCK, RPS.SCISSORS),
				"Test failed. Expected human but got " + test.pickWinner(RPS.ROCK, RPS.SCISSORS));
	}

	@Test
	void testPickWinnerComputer() {
		Battle test = new Battle();

		assertEquals("computer", test.pickWinner(RPS.PAPER, RPS.SCISSORS),
				"Test failed. Expected human but got " + test.pickWinner(RPS.PAPER, RPS.SCISSORS));
		assertEquals("computer", test.pickWinner(RPS.SCISSORS, RPS.ROCK),
				"Test failed. Expected human but got " + test.pickWinner(RPS.SCISSORS, RPS.ROCK));
		assertEquals("computer", test.pickWinner(RPS.ROCK, RPS.PAPER),
				"Test failed. Expected human but got " + test.pickWinner(RPS.ROCK, RPS.PAPER));
	}

}
