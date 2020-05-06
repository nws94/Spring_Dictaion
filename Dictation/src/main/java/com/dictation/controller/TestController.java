package com.dictation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dictation.service.TestService;
import com.dictation.vo.TestVO;

@RestController
@RequestMapping(value="/api/test")
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping
	public List<TestVO> select() {
		return testService.select();
	}
	
	@PostMapping
	
	public void insertTestVO(@RequestBody TestVO testVO) {
		testService.insertTestVO(testVO);
	}
}
