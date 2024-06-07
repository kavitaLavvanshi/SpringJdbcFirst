package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao{
	
	
	private JdbcTemplate jdbcTemplate;
	@Override
	public int insert(Student student) {
		String query="insert into Student values(?,?,?,?)";
		int r=	this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity(),student.getAddress());
		
		
		return r;
		 
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	
}
