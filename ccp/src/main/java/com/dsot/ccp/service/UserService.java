package com.dsot.ccp.service;

import com.dsot.ccp.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}