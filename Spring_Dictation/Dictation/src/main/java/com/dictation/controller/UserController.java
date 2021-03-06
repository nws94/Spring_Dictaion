package com.dictation.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dictation.service.UserService;
import com.dictation.vo.UserVO;

@CrossOrigin("*")
@RestController
@RequestMapping(value="/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
    //insert user
	@PostMapping(produces = "application/json;charset=UTF-8")
	public void execWrite(@RequestBody UserVO user) {
		userService.insert(user);
	}


      //according to id delete
	@GetMapping(value="/delete/{user_id}")
	public void delete(@PathVariable("user_id") String user_id) {
		userService.delete(user_id);
	}
	//modify
	//user_id는 같아야 함
	@PostMapping(value="/update")
	public void update(@RequestBody UserVO user) {
		userService.update(user);
	}

	//according to id Query students
	@GetMapping(value="/get/{user_id}")
	public UserVO getById(@PathVariable("user_id") String user_id) {
		UserVO user = userService.getById(user_id);
		return user;
	}
	
	//All queries
	@GetMapping(value="/list")
	public List<UserVO> list(){
		return userService.list();
	}	
	
}
