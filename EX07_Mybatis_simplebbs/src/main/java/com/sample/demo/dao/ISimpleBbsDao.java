package com.sample.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sample.demo.dto.SimpleBbsDto;

@Mapper
public interface ISimpleBbsDao {
	public List<SimpleBbsDto> listDao();
	public Integer countDao();
	public SimpleBbsDto viewDao(int id);
	public int writeDao(String writer, String title, String content);
	public int delete(String id); //delete?id=1;
}
