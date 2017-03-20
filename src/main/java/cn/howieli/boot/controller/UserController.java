package cn.howieli.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.howieli.boot.model.User;
import cn.howieli.boot.service.IUserService;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	@GetMapping("/updateUser")
	public String updateUser() {
		userService.updateUser();
		return "修改完成";
	}
	
}
