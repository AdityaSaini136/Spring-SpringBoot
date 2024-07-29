package com.exm.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.exm.orm.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;
    @Transactional
	public int  insert(Student student) {
		Integer save = (Integer)this.hibernateTemplate.save(student);
		return save;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


}
