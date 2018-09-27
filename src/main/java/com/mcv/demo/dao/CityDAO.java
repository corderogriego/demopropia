package com.mcv.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcv.demo.model.City;

public interface CityDAO extends JpaRepository<City, Integer> {

}
