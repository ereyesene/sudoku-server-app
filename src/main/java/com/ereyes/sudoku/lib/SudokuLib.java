package com.ereyes.sudoku.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ereyes.sudoku.model.SudokuDto;
import com.ereyes.sudoku.model.SudokuPositions;

public class SudokuLib {
	private int puzzle[][] = new int[9][9];
	
	public List<String> generateDefaultSudoku() {
		String[] board = {
				"200007500065010004700050000000006903600000078074001000000400001437000095902538000",
		        "000090501000000020830020000004016750300075018050000090410000902703000100020650004",
		        "010000000687000010000097003000000000700000340040926000009605002002030000500019700",
		        "600157000300204090010006040260010803500000924003900005130602000946831700700049010",
		        "090083000000900007008000010200064000030000000000102070020000340050040020000006001",
		        "308062015400000060060070008802400107000008300000053280000500670200000000010020540",
		        "290005000500703409000908561000040610900800007003672080640050800820306045305200100",
		        "470000608062000040000004201890506037006000805000001002900000580687000000050063000",
		        "000400190030000860007083500000008600805100000020000350081040000000070000040250000",
		        "085000009704580100000000038026810005800004720070000091000900000000070910190600050"
		};
		ArrayList<String> data = new ArrayList<>(Arrays.asList(board[(int) Math.round(Math.random() * 9)].split("")));
		return data.stream()
			    .map(s -> Integer.parseInt(s) == 0 ? null : s)
			    .collect(Collectors.toList());
	}
	
	public List<Integer> generateSudokuFromJson(List<SudokuPositions> sudoku) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				puzzle[i][j] = 0;
			}
		}
		
		for (int i = 0; i < sudoku.size(); i++) {
			puzzle[sudoku.get(i).getY()][sudoku.get(i).getX()] = sudoku.get(i).getValue();
		}
		
		ArrayList<Integer> sudokuData = new ArrayList<Integer>();
		for (int i = 0; i < puzzle.length; i++) {
	        // tiny change 1: proper dimensions
	        for (int j = 0; j < puzzle[i].length; j++) { 
	            // tiny change 2: actually store the values
	        	// System.out.println(puzzle[i][j]);
	        	sudokuData.add(puzzle[i][j]);
	        }
	    }
		System.out.println(sudokuData);
		
		return sudokuData.stream()
				.map(s -> s == 0 ? null : s)
			    .collect(Collectors.toList());
	}
	
}
