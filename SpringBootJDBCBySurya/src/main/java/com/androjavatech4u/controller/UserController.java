package com.androjavatech4u.controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.androjavatech4u.entites.User;

@Controller
public class UserController {
	@Autowired
	JdbcTemplate jdbc;

	@RequestMapping("/login")
	public ModelAndView doLogin(HttpServletRequest request) {
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		User user = new User();
		user.setEmail(email);
		user.setPass(pass);
		ModelAndView modelAndView = new ModelAndView("index.jsp");
		modelAndView.addObject("userObj", user);
		//modelAndView.addObject("pass", pass);
		return modelAndView;
	}
	@RequestMapping(value="/register")
	public ModelAndView register(HttpServletRequest request, HttpSession session) {
		String name = request.getParameter("name");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		User user = new User();
		user.setName(name);
		user.setMobile(mobile);
		user.setEmail(email);
		user.setPass(pass);
		String query = "insert into list values(?,?,?,?)";
		jdbc.execute(query, new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setString(1, user.getName());
				ps.setString(2, user.getMobile());
				ps.setString(3, user.getEmail());
				ps.setString(4, user.getPass());
				return ps.execute();
			}
		});
		//jdbc.execute("insert into list values('Ram', '90887655', 'ram@gmail.com', '786897')");
		//jdbc.execute("insert into list values('"+name+"','"+mobile+"','"+email+"','"+pass+"')");
		ModelAndView modelAndView = new ModelAndView("index.jsp");
		//modelAndView.addObject("userObj",user);
		session.setAttribute("name", name);
		session.setAttribute("email", email);
		return modelAndView;
	}
}

