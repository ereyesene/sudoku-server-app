package com.ereyes.sudoku.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ereyes.sudoku.lib.SudokuLib;
import com.ereyes.sudoku.model.Sudoku;
import com.ereyes.sudoku.model.SudokuDto;
import com.ereyes.sudoku.model.SudokuPositions;
import com.ereyes.sudoku.model.User;
import com.ereyes.sudoku.repository.SudokuRepository;
import com.ereyes.sudoku.repository.UserRepository;

@RestController
public class SudokuController {
	@Autowired
	private SudokuRepository sudokuRepository;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/get-sudoku")
    public List<String> getAllNotes() {
		SudokuLib sudokuLib = new SudokuLib();
		return sudokuLib.generateDefaultSudoku();
    }
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/upload-sudoku")
	public List<Integer> create(@Valid @RequestBody List<SudokuPositions> sudoku) {
		SudokuLib sudokuLib = new SudokuLib();
		return sudokuLib.generateSudokuFromJson(sudoku);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/sudoku")
	public List<Sudoku> save(@Valid @RequestBody Sudoku sudoku) {
		sudokuRepository.save(sudoku);
		return sudokuRepository.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/sudoku")
	public List<Sudoku> getAll() {
		return sudokuRepository.findAll();
	}
	
}
