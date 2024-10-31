package xiangqi;

import javax.swing.*;
import java.awt.*;

public class Piece extends JPanel{
	private static int tileSize;
	private int col;
	private int row;
	private int radius;
	private boolean confined;
	private boolean red;
	
	public Piece() {
		tileSize = 75;
		confined = false;
		red = false;
		col = 0;
		row = 0;
		radius = 50;
	}
	public Piece(int col, int row, boolean r) {
		tileSize = 75;
		confined = false;
		red = r;
		this.col = col;
		this.row = row;
		radius = 50;
		
	}
	public void showMovement() {
		
	}
	public void paint(Graphics2D g2D) {
		g2D.fillOval((col*tileSize)-(radius/2), (row*tileSize)-(radius/2), radius, radius);
	}
	public void printString() {
		System.out.println(col + " " + row + " " + col*tileSize + " " + row*tileSize);
	}
	public int getCol() {
		return col;
	}
	public int getRow() {
		return row;
	}
	public int getTile() {
		return tileSize;
	}
	public int getRadius() {
		return radius;
	}
	public String toString() {
		return "Col: " + col + " Row " + row;
	}
	public boolean isRed() {
		if (red) {
			return true;
		}
		return false;
	}
}
