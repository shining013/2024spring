package com.sample.demo.dao;

import java.util.List;

import com.sample.demo.dto.SimpleDbsDto;

public interface ISimpleDbsDao {
	public List<SimpleDbsDto> listDao();
	public Integer countDao();
	public SimpleDbsDto viewDao(String id);
	public int writeDao(String writer, String title, String content);
	public int deleteDao(String id); //delete?id=1;
}
