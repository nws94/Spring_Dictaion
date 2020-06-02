package com.dictation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dictation.vo.EnrollVO;

@Repository
@Mapper
public interface EnrollMapper {	//enrollMapper.xml���� �̸�,��ɾ� ����	
	
	//insert
	public void insert(EnrollVO enroll);

	//according to id delete
	public void delete(String user_id);	//�ϴ��� user_id ����.

	//according to user Of id modify
	public void update(EnrollVO enroll);

	//according to id query
	public EnrollVO getById(String user_id);	//�ϴ��� user_id ����.

	//All queries
	public List<EnrollVO> list();

	
}
