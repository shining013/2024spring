package com.sample.demo.dao;

import java.util.List;

import com.sample.demo.dto.SimpleDbsDto;

public interface ISimpleDbsDao {
	public List<SimpleDbsDto> listDao();
	public Integer countDao();
	public SimpleDbsDto viewDao(String id);
}
