package com.mcv.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcv.demo.model.User;

public interface UserDAO extends JpaRepository<User, Integer> {

}
