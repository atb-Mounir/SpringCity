package com.eni.SpringCity.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // Auto-incrémenté
	private int id;
	private String name;
	private int people;
	private String description;
	
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private LocalDate councilDay;
	
	

	public City() {
		
	}
	
	

	public City(int id, String name, int people, String description, LocalDate councilDay) {
		this.id = id;
		this.name = name;
		this.people = people;
		this.description = description;
		this.councilDay = councilDay;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getCouncilDay() {
		return councilDay;
	}

	public void setCouncilDay(LocalDate councilDay) {
		this.councilDay = councilDay;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", people=" + people + ", description=" + description
				+ ", councilDay=" + councilDay + "]";
	}
	
	

}
