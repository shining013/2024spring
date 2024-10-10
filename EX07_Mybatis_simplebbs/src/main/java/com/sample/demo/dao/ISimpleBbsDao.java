package com.sample.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sample.demo.dto.SimpleBbsDto;

@Mapper
public interface ISimpleBbsDao {
	public List<SimpleBbsDto> listDao();
	public int countDao();
	public SimpleBbsDto viewDao(String sId);
	public int writeDao(String writer, String title, String content);
	public int delete(@Param("_id") String id); //delete?id=1;
}
