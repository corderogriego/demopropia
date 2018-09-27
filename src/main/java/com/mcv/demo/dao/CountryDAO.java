package com.mcv.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcv.demo.model.Country;

public interface CountryDAO extends JpaRepository<Country, Integer> {

}
