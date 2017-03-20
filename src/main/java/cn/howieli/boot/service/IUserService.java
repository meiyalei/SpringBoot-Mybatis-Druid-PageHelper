package cn.howieli.boot.service;

import java.util.List;

import cn.howieli.boot.model.User;

public interface IUserService {
	public List<User> getUsers();
	public void updateUser();
}
