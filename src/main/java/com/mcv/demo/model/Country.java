package com.mcv.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCountry;
	
	private String name;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
	private List<Province> provincies = new ArrayList<>();
}
