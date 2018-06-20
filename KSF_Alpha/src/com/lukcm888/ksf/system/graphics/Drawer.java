package com.lukcm888.ksf.system.graphics;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * 
 * @author maxwellmackoul
 * 
 * 	The Drawer class handles rendering images to the application.
 * 	All images are handled by there own unique methods that are
 * 	stored in this class.
 * 	
 *
 */
public class Drawer {
	
	private static String className = Drawer.class.getName();
	
	private BufferedImage backgroundImage;

	public JPanel drawBackgroundImage(Graphics g) {
		
		
		JPanel temp = new JPanel(){
			private static final long serialVersionUID = 1L;
			     
			@Override
		    public void paintComponent(Graphics g) {
				
				try {
					backgroundImage = ImageIO.read(this.getClass().getResource("/resources/ksf_background.png"));
			       } catch (IOException ex) {
			            System.out.println("not found");
			       }
			   
				g.drawImage(backgroundImage, 0, 0, null);
			}         
	    };
		return temp;

	}
}
