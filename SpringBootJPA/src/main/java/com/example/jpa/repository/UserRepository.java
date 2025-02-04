package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
