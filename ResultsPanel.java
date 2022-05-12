package a8;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class ResultsPanel extends JPanel {
	private JLabel displayHuman = new JLabel("Human choice: no selection");
	private JLabel displayComputer = new JLabel("Computer: no selection");
	private JLabel displayWinner = new JLabel("Winner:");

	/**
	 * The results panel clearly communicate the choices made by the player and the
	 * computer and show who won. You will likely need some instance variables so
	 * the updateResults method can access parts of the panel to update them. A
	 * layout will help arrange these parts of the panel
	 */
	public ResultsPanel() {
		setLayout(new GridLayout(3, 1));

		this.add(displayHuman);
		this.add(displayComputer);
		this.add(displayWinner);
	}

	/**
	 * This method will update each round and display what choice the human and
	 * computer made and also display who won that round
	 * 
	 * @param human    the choice that the human makes
	 * @param computer the choice that the computer makes
	 * @param winner   the winner is output
	 */
	public void updateResults(RPS human, RPS computer, String winner) {
		displayHuman.setText("Human choice: " + human.toString());
		displayComputer.setText("Computer choice: " + computer.toString());
		displayWinner.setText("Winner: " + winner);
	}

	// Example test code to test this frame
	public static void main(String[] args) {
		JFrame testFrame = new JFrame("test results");

		// Code similar to the following can be used to test
		// this panel on its own. You can create a panel
		// and call methods on it without worrying
		// how the other panels interact with it.
		ResultsPanel testPanel = new ResultsPanel();
		testPanel.updateResults(RPS.ROCK, RPS.PAPER, "computer");

		testFrame.pack();
		testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		testFrame.setVisible(true);
	}

}
