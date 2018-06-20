package com.lukcm888.ksf.system;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.lukcm888.ksf.system.board.Tile;

public class Game extends JFrame {
	
	
	private Display display;
	private int width = 0;
	private int height = 0;
	public String title = "Demo";
	private boolean running = false;
	private Thread thread;
	private BufferStrategy bs;
	private Tile current, previous;
	private Tile board[][];

	private JPanel gameBoard = new JPanel(new GridLayout (10, 10));
	
	// draw board 
	private Game(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		
		// Set up display
		display = new Display(title, width, height);
		display.setVisible(true);
		display.setResizable(false);
		
		// Initialize game settings 
		
		
	}
	
	
	public void gameLoop() {
		
		boolean running = true;
		
		while (running) {
		
		
		// wait for user to select a unit
		
		// user clicks on area they want the unit to move to
			// if on enemy, combat
			// else if on flag, game over
			// else end turn
		
		// Player 2's turn
			
		// computer chooses piece to move
		
			// scans pieces
			// calculates play style for the turn (aggressive, defensive, tactical, timid)
			// make move
				// if on enemy, combat
				// else if on flag, game over
				// else end turn
		
			
		}
			
	}
	
	public static void main (String args[]) {
		Game game = new Game("KSF", 1100, 800);
		game.gameLoop();
	}

}
