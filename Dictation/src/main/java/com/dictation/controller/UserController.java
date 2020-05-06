package com.dictation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dictation.service.UserService;
import com.dictation.vo.UserVO;

@RestController
@RequestMapping(value="/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(produces = "application/json;charset=UTF-8")
	public void signUp(@RequestBody UserVO userVO) {
		userService.signUp(userVO);
	}
}
