package com.ereyes.sudoku.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ereyes.sudoku.lib.SudokuLib;
import com.ereyes.sudoku.model.User;
import com.ereyes.sudoku.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	
	private UserRepository userRepository;
	
	@PostMapping("/user")
	public @ResponseBody User create(@Valid @RequestBody User user) {
		return userRepository.save(user);
	}
	
	@GetMapping("/books")
    public List<String> getAllNotes() {
		SudokuLib sudokuLib = new SudokuLib();
		return sudokuLib.generateDefaultSudoku();
    }
	
	
}
