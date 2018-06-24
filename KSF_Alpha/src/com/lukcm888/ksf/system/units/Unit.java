package com.lukcm888.ksf.system.units;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import com.lukcm888.ksf.system.board.Tile;

/**
 * 
 * @author maxwellmackoul
 * 
 * Abstract class that defines all common variables and methods among units
 * 
 * 
 *
 */

public abstract class Unit implements Cloneable {
	
	private String id;
	private String name;
	private int health;
	private int attack;
	private int armor;
	private int defense;
	private String type;
	private int movementValue;
	private int range;
	private int dieRole;
	private BufferedImage unitImage;
	protected ArrayList<Tile> possibleUnitMoves = new ArrayList<Tile>();
	public abstract ArrayList <Tile> move(Tile position[][], int x, int y);
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMovementValue() {
		return movementValue;
	}

	public void setMovementValue(int movementValue) {
		this.movementValue = movementValue;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getDieRole() {
		return dieRole;
	}

	public void setDieRole(int dieRole) {
		this.dieRole = dieRole;
	}

	public BufferedImage getUnitImage() {
		return unitImage;
	}

	public void setUnitImage(BufferedImage unitImage) {
		this.unitImage = unitImage;
	}


}
