package com.ereyes.sudoku.repository;
import com.ereyes.sudoku.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
}
