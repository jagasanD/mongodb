package com.mongo.service;

import java.util.List;

import com.mongo.model.AppUser;

public interface UserService {

	public void saveUser(AppUser user);

	public List<AppUser> getUsers();
}
