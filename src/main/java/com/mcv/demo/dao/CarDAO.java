package com.mcv.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcv.demo.model.Car;

public interface CarDAO extends JpaRepository<Car, Integer> {
//
//	select * from car where model like '%?1%'
//
	//Optional<Car> findOneByModel(String m);

}
