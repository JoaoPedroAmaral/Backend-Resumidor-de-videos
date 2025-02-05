package com.resumovideo.projeto.repository;

import com.resumovideo.projeto.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends  JpaRepository<User, Long>{
	User findByUsername(String username);
}
