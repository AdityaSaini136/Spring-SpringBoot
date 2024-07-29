package com.exm.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.exm.jdbc.dao.StudentDao;
import com.exm.jdbc.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages =  {" com.exm.jdbc.dao"})
public class JDBCConfig {

	@Bean("ds")
	public DriverManagerDataSource  getDataSource() {

		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc?useSSL=false");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	@Bean("jdbcTemplate")
	public JdbcTemplate getTamplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	@Bean("studentDao")
	public StudentDao studentDao() {
		StudentDaoImpl studentDao = new StudentDaoImpl();
		studentDao.setJdbcTamplate(getTamplate());
		return studentDao;
	}
}