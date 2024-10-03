package com.mysite.sbbmybatis;

import org.apache.ibatis.annotations.Mapper;

import com.mysite.sbbmybatis.DTO.MessageDTO;

@Mapper
public interface HelloMapper {
	MessageDTO getBook(int id);
}
