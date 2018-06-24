package com.lukcm888.ksf.system.units;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import com.lukcm888.ksf.system.board.Tile;

/**
 * 
 * 
 * @author maxwellmackoul
 * 
 * 	The class for the Knight Unit.  The Knight is a Calvary unit that is strong 
 * 	against footmen.  They are masters of the field and excel in open terrian.
 * 
 * 	In terms of code, the Knight class inherits the Unit abstract class. The
 * 	unique moves, rules, and abilites are defined in this class.
 *
 */

public class Knight extends Unit {
	
	// variables
	private int charge;
	
	public Knight(int health, int attack, int armor, int defense, 
			String type, int movementValue, int dieRole, BufferedImage unitImage) {
		// TODO Auto-generated constructor stub
		
		setHealth(health);
		setAttack(attack);
		setArmor(armor);
		setDefense(defense);
		setType(type);
		setMovementValue(movementValue);
		setDieRole(dieRole);
		setUnitImage(unitImage);
	}
	

	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}


	@Override
	public ArrayList<Tile> move(Tile[][] position, int x, int y) {
		
		possibleUnitMoves.clear();
		
		// Movement algorithim:
		
		// check to see what adajcent tiles Knight can move to
		// Knight.getAdjacentTile()
			// x, y, get x+0, y +1, x + 1, y + 1, etc.
			// if tile is unoccupied or not out of bounds add to possible move array
		// subtract move by 1
		// check to see what adajacent tiles the knight could move from those tiles 
		// (in the possible move array)
		// Tile.getAdjacentTile();
		// display those tiles that the knight can move
		// Subtract move by 1
		//repeat until no more moves
		
		
		return possibleUnitMoves;
	}
	
	

}
