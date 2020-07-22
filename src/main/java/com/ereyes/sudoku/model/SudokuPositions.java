package com.ereyes.sudoku.model;

public class SudokuPositions {
	private int y;
	private int x;
	private int value;
	
	
	public SudokuPositions() {
		super();
	}


	public SudokuPositions(int y, int x, int value) {
		super();
		this.y = y;
		this.x = x;
		this.value = value;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return "SudokuPositions [y=" + y + ", x=" + x + ", value=" + value + "]";
	}
	
	
	
	
}
