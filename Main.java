package xiangqi;

import javax.swing.*;
import java.awt.*;

public class Main {
	
	public static void main(String[] args) {
		int width = 1000;
		int height = 1000;
		JFrame frame = new JFrame();

		Board board = new Board();
		frame.setSize(width, height);
		frame.setLayout(new GridBagLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Blah");
		frame.add(board);
		frame.setVisible(true);
	}
}
