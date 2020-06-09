package com.dictation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dictation.vo.CourseVO;

@Repository
@Mapper
public interface CourseMapper {	//courseMapper.xml���� �̸�,��ɾ� ����	
	
	//insert
	public void insert(CourseVO course);

	//according to id delete
	public void delete(CourseVO course);	//�ϴ��� lecture_no�� ���� ���������ϵ��� ����.

	//according to user Of id modify
	public void update(CourseVO course);

	//according to id query
	public CourseVO getById(int lecture_no);	//�ϴ��� lecture_no����

	//All queries
	public List<CourseVO> list();
	
	//search file_nm for file download
	public String getFileNm(String save_file_nm);

	
}
