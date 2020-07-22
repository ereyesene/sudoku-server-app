package com.ereyes.sudoku.model;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Sudoku {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private Integer user_id;
	
	private String to_solve;
	
	private String solution;
	
	@Column(nullable = true, columnDefinition = "TINYINT", length = 1)
	private boolean is_solved;
		
	@Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;
	
	@Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;
	
	public Sudoku(){
        super();
    }

	public Sudoku(Integer user_id, String to_solve, String solution) {
		super();
		this.user_id = user_id;
		this.to_solve = to_solve;
		this.solution = solution;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getTo_solve() {
		return to_solve;
	}

	public void setTo_solve(String to_solve) {
		this.to_solve = to_solve;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public boolean isIs_solved() {
		return is_solved;
	}

	public void setIs_solved(boolean is_solved) {
		this.is_solved = is_solved;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
}
