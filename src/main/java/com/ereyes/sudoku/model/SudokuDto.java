package com.ereyes.sudoku.model;

import java.util.List;

public class SudokuDto {
	private List<Object> sudoku;

	@Override
	public String toString() {
		return "SudokuDto [sudoku=" + sudoku + "]";
	}

	public List<Object> getSudoku() {
		return sudoku;
	}

	public void setSudoku(List<Object> sudoku) {
		this.sudoku = sudoku;
	}

	
}
