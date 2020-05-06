package com.dictation.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dictation.vo.UserVO;

@Repository
@Mapper
public interface UserMapper {
	public void signUp(UserVO userVO);
}
