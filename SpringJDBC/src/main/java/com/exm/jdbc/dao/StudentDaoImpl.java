package com.exm.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.exm.jdbc.entites.Student;

@Component("studentDao")
public class StudentDaoImpl  implements StudentDao{

	@Autowired
	JdbcTemplate  jdbcTamplate;

	@Override
	public int insert(Student student) {
		String query = "insert into student(id,name,city) values(?,?,?)";
		int insert = this.jdbcTamplate.update(query , student.getId() , student.getName(), student.getCity());
		return insert;
	}
	@Override
	public int update(Student student) {
		String insert = "update student set name=? ,city=? where id=?";
		int update = this.jdbcTamplate.update(insert , student.getName(), student.getCity(), student.getId());
		return update;
	}
	@Override
	public int delete(int studentid) {
		String insert = "delete from student where id=?";
		int delete = this.jdbcTamplate.update(insert , studentid);
		return delete;
	}
	@Override
	public Student getStudent(int studentid) {
		String insert = " select * from student where id =?";
		RowMapper<Student> mapperImpl = new RowMapperImpl();
		Student queryForObject = this.jdbcTamplate.queryForObject(insert, mapperImpl , studentid);
		return queryForObject;
	}
	@Override
	public List<Student> getAllStudent() {
		String insert = " select * from student";
		RowMapper<Student> mapperImpl = new RowMapperImpl();
		List<Student> students = this.jdbcTamplate.query(insert, new  RowMapperImpl());
		return students;
	}
	public JdbcTemplate getJdbcTamplate() {
		return jdbcTamplate;
	}
	@Autowired
	public void setJdbcTamplate(JdbcTemplate jdbcTamplate) {
		this.jdbcTamplate = jdbcTamplate;
	}
}
