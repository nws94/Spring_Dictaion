package com.dictation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dictation.mapper.UserMapper;
import com.dictation.vo.UserVO;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public void signUp(UserVO userVO) {
		userMapper.signUp(userVO);	
	}
}
