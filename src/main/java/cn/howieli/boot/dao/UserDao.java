package cn.howieli.boot.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.howieli.boot.model.User;

@Repository
public interface UserDao {
	public List<User> getUsers();
	public void updateUser(User user);
}
