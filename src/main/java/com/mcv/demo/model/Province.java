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
public class Province {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Integer idProvince;
		
	private String name;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "province")
	private List<City> cities = new ArrayList<>();
	
	@ManyToOne
	private Country country;
}
