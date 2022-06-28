package com.cg.spring.boot.service;

import java.util.List;

import com.cg.spring.boot.model.AppUser;

public interface IAppUserService {

	public abstract List<AppUser> getAllUsers();

	public abstract AppUser registerUser(AppUser appUser);

	public abstract AppUser loginUser(AppUser appUser);

	public abstract String logoutUser(String userName);

	public abstract AppUser updateUser(AppUser appUser);

}
