package com.lukcm888.ksf.system.board;

import javax.swing.JPanel;

/**
 * 
 * @author maxwellmackoul
 *
 * Tile class.  The backbone of KSF.  Tiles represent the squares on the board where pieces can move.
 * Tiles can have different terrain, and therefore different images, defense modifiers, and bonuses.
 * All tile types extend this abstract class.  This abstract class contains all of the variables and 
 * methods associated with it.
 */

public class Tile extends JPanel implements Cloneable {
	

	private static final long serialVersionUID = 1L;
	private boolean isOccupied = false;
	private boolean isSelected = false;
	private Terrian terrianType;
	private boolean nBound = false, sBound = false, wBound = false, eBound = false;
	public int xCor = 0, yCor = 0;
	
	// Constructor to craft cells on the bound
	public Tile(boolean isOccupied, Terrian terrianType, int xCor, int yCor) {
		this.isOccupied = isOccupied;
		this.terrianType = terrianType;
		this.xCor = xCor;
		this.yCor = yCor;
		
		//TODO:  implement algorithm to determine what the tile's terrain should be set to
	}

	public boolean isOccupied() {
		return isOccupied;
	}

	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	
	

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public Terrian getTerrianType() {
		return terrianType;
	}

	public void setTerrianType(Terrian terrianType) {
		this.terrianType = terrianType;
	}

	public boolean isnBound() {
		return nBound;
	}

	public void setnBound(boolean nBound) {
		this.nBound = nBound;
	}

	public boolean issBound() {
		return sBound;
	}

	public void setsBound(boolean sBound) {
		this.sBound = sBound;
	}

	public boolean iswBound() {
		return wBound;
	}

	public void setwBound(boolean wBound) {
		this.wBound = wBound;
	}

	public boolean iseBound() {
		return eBound;
	}

	public void seteBound(boolean eBound) {
		this.eBound = eBound;
	}

	public int getxCor() {
		return xCor;
	}

	public void setxCor(int xCor) {
		this.xCor = xCor;
	}

	public int getyCOr() {
		return yCor;
	}

	public void setyCOr(int yCOr) {
		this.yCor = yCOr;
	}
	
	
	
}
