package com.mcv.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idUser;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<Car> cars = new ArrayList<>();

	private String name;
	
	@ManyToOne
	private City city;

		

}