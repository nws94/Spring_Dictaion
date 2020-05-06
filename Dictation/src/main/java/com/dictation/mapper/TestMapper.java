package com.dictation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dictation.vo.TestVO;

@Repository
@Mapper
public interface TestMapper {
	public List<TestVO> selectTest();
	public void insertTest(TestVO testVO);
}
