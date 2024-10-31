package xiangqi;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JPanel {
	private static ArrayList<ArrayList<Piece>> board;
	private static int tileSize;
	private int cols, rows;
	
	public Board() {
		super();
		tileSize = 75;
		cols = 9;
		rows = 10;
		this.setLayout(null);
		board = new ArrayList<ArrayList<Piece>>();
		this.setBackground(Color.blue);
		for (int i = 0; i < rows; i ++) {
			ArrayList<Piece> newRow = new ArrayList<>();
			board.add(newRow);
			for (int j = 0; j < cols; j ++) {
				Piece placeholder = new Piece();
				board.get(board.size()-1).add(placeholder);
			}
		}
		//addPieces();
		setPreferredSize(new Dimension((cols-1)*tileSize+1, rows*tileSize+1));
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(new Color(0, 0, 0));
		//Draws box
		g2d.drawLine(0, 0, (cols-1) * tileSize, 0);
		g2d.drawLine(0, (rows-1) * tileSize, (cols-1) * tileSize, (rows-1) * tileSize);
		g2d.drawLine(0, 0, 0, (rows-1) * tileSize);
		g2d.drawLine((cols-1) * tileSize, 0, (cols-1) * tileSize, (rows-1) * tileSize);
		//Draws intersecting lines
		for (int r = 1; r <= (rows-1); r++) {
			g2d.drawLine(0, r*tileSize, ((cols-1)) * tileSize, r*tileSize);
			for (int x = 0; x < 2; x++) {
				if (x == 0) {
					g2d.drawLine(r*tileSize, 0, r*tileSize, 4*tileSize);
				}
				else {
					g2d.drawLine(r*tileSize, 5*tileSize, r*tileSize, (rows-1) * tileSize);
				}
				
			}
		}
		
		//Draw pieces
		/*for (int r = 0; r < board.size()-1; r ++) {
			for (int c = 0; c < board.get(0).size()-1; c ++) {
				board.get(c).get(r).paint(g2d);
			}
		}*/
	}
	public void addPieces() {
		Piece test = new Piece(0, 0, false);
		General bg = new General(4, 4, false);
		board.get(0).set(0,test);
		this.add(test);
		board.get(0).set(4,bg);
		this.add(bg);
		
		
	}
	public Piece getPiece(int col, int row) {
		for (int r = 0; r < board.size(); r ++) {
			for (int c = 0; c < board.get(0).size(); c ++) {
				Piece piece = board.get(c).get(r);
				if (piece.getCol() == col && piece.getRow() == row) {
					return piece;
				}
			}
		}
		return null;
	}
	public int getTile() {
		return tileSize;
	}
	public void printBoard() {
		
	}
}
