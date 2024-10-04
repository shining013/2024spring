package com.sample.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sample.demo.dto.SimpleDbsDto;

@Repository
public class SimpleDbsDao implements ISimpleDbsDao {
	
	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<SimpleDbsDto> listDao() {
		System.out.println("listDao()");
		String query = "select * from simple_dbs order by id desc";
		List<SimpleDbsDto> dtos = template.query(query, new BeanPropertyRowMapper<>(SimpleDbsDto.class)
				);
		return dtos;
	}
	
	@Override
	public Integer countDao() {
		System.out.println("countDao()");
		String query = "select count(*) from simple_dbs";
		Integer count = template.queryForObject(query, Integer.class);
		return count;
	}
	
	@Override
	public SimpleDbsDto viewDao(String id) {
		System.out.println("viewDao()");
		String query = "select * from simple_dbs where id = " + id;
		SimpleDbsDto dto = template.queryForObject(query, 
				new BeanPropertyRowMapper<>(SimpleDbsDto.class)
				);
		return dto;
	}

}
