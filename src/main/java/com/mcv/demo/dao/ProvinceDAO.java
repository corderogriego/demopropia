package com.mcv.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcv.demo.model.Province;

public interface ProvinceDAO extends JpaRepository<Province, Integer> {

}
