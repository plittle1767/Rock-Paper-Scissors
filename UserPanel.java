package a8;

import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class UserPanel extends JPanel implements ActionListener {
	private Battle parent;
	private JButton rock = new JButton("Rock");
	private JButton paper = new JButton("Paper");
	private JButton scissors = new JButton("Scissors");

	/**
	 * This panel should have three buttons for rock, paper, or scissors. If a
	 * button is pushed, then this choice should be sent to parent.playGame() where
	 * the winner is chosen and the results panel is updated
	 * 
	 * @param parent the parent of this class that comes from the Battle class
	 */
	public UserPanel(Battle parent) {
		super();
		// Store the Battle object so we can call playGame().
		this.parent = parent;

		JPanel panel = new JPanel();

		parent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		this.add(rock);
		rock.setMaximumSize(new Dimension(400, 400));
		this.add(paper);
		paper.setMaximumSize(new Dimension(400, 400));
		this.add(scissors);
		scissors.setMaximumSize(new Dimension(400, 400));

		rock.addActionListener(this);
		paper.addActionListener(this);
		scissors.addActionListener(this);

		this.add(panel);
		panel.setVisible(true);
	}

	/**
	 * Here we are able to click the RPS buttons to tell the Battle class what our
	 * choice is
	 * 
	 * @param e the parameter is what allows us to use ActionListener features
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == rock)
			parent.playGame(RPS.ROCK);
		if (e.getSource() == paper)
			parent.playGame(RPS.PAPER);
		if (e.getSource() == scissors)
			parent.playGame(RPS.SCISSORS);
	}

}