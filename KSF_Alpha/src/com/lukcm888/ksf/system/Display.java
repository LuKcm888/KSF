package com.lukcm888.ksf.system;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.lukcm888.ksf.system.graphics.Drawer;

public class Display extends JFrame {
	
	private String title;
	private int width, height;
	private Container container;
	private Graphics g;
	private BufferedImage image;
	private JPanel background;
	
	private static final int BATTLEFIELD_X_SIZE = 10;
	private static final int BATTLEFIELD_Y_SIZE = 10;
	private JPanel battlefield = new JPanel(new GridLayout(BATTLEFIELD_X_SIZE,BATTLEFIELD_Y_SIZE));

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 *  Constructor
	 */
	public Display(String title, int width, int height) {
		
		this.title = title;
		this.width = width;
		this.height = height;
		
		initDisplay();
	}
	
	/**
	 *  Initialize Display 
	 */
	private void initDisplay() {
		
		battlefield.setMinimumSize(new Dimension(800, 700));
		ImageIcon img = new ImageIcon(this.getClass().getResource("/resources/ksf_background.png"));
		this.setIconImage(img.getImage());
		
		container=getContentPane();
		setSize(width, height);
		setTitle("Knight, Spearman, Footman");
		container.setBackground(Color.blue);

		
		Drawer drawer = new Drawer();
		JPanel temp = drawer.drawBackgroundImage(g);
		
	    temp.setMinimumSize(new Dimension(800,700));
	    container.add(temp);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
		

	}
		
	
}




/*private JFrame frame;
private Canvas canvas;
private String title;
private int width, height;

public Display(String title, int width, int height) {
	this.title = title;
	this.width = width;
	this.height = height;	
	
	createDisplay();
}

private void createDisplay() {
	frame = new JFrame(title);
	frame.setSize(width, height);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	
	canvas = new Canvas();
	canvas.setPreferredSize(new Dimension(width, height));
	canvas.setMaximumSize(new Dimension(width, height));
	canvas.setMinimumSize(new Dimension(width, height));
	canvas.setFocusable(false);
	
	frame.add(canvas);
	frame.pack();
	
}

public Canvas getCanvas() {
	return canvas;
}

public JFrame getFrame() {
	return frame;
}*/