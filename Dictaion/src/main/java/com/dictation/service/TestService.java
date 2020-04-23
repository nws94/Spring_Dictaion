package com.dictation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dictation.mapper.TestMapper;
import com.dictation.vo.TestVO;

@Service
public class TestService {
	
	@Autowired
	private TestMapper testMapper;
	
	public List<TestVO> select() {
		return testMapper.selectTest();
	}
}
