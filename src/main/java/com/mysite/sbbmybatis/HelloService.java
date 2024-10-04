package com.mysite.sbbmybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysite.sbbmybatis.DTO.MessageDTO;

@Service
public class HelloService {
	@Autowired
	private HelloMapper mapper;
	
	public MessageDTO getBook(int id) {
		return mapper.getBook(id);
	}
	
	public void insertInfo(MessageDTO data) {
		mapper.insertInfo(data);
	}
	
}
