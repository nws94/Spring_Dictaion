package com.dictation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dictation.vo.BoardVO;

@Repository
@Mapper
public interface BoardMapper {	//boardMapper.xml���� �̸�,��ɾ� ����	
	
	//insert
	public void insert(BoardVO board);

	//according to id delete
	public void delete(String seq_no);	//�ϴ��� ���� �Ϸù�ȣ�� ����. �Ƹ� �Ϸù�ȣ, ���¹�ȣ�� �߰��� ���� ����

	//according to user Of id modify
	public void update(BoardVO board);

	//according to id query
	public BoardVO getById(String seq_no);	//�ϴ� �����Ϸù�ȣ��

	//All queries
	public List<BoardVO> list();

	
}
