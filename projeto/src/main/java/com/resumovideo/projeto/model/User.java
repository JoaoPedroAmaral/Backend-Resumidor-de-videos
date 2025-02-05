package com.resumovideo.projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"user\"")
public class User {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private Long user_id;
	
	private String username;
    private String password;
    private boolean is_premium;
    
    // Getter and Setter
	public Long getId() {
		return user_id;
	}
	public void setId(Long id) {
		this.user_id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isPremium() {
		return is_premium;
	}
	public void setPremium(boolean isPremium) {
		this.is_premium = isPremium;
	}
    
    
}
