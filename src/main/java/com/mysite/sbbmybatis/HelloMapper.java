package com.mysite.sbbmybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mysite.sbbmybatis.DTO.MessageDTO;

@Mapper
public interface HelloMapper {
	MessageDTO getBook(int id);
	
	List<MessageDTO> getBookList();	
	
	void insertInfo(MessageDTO data);
	
}
