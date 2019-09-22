package com.jpaexample.jpademo.entites;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table
public class Manager {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int managerId;
	private String firstName;
	private String LastName;
	
	@OneToMany(mappedBy="manager", fetch=FetchType.LAZY)
	private Set<Projects> projects;
	
	public Manager() {
		super();
	}

	public Manager(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		LastName = lastName;
	}

	
	
	

	public Set<Projects> getProjects() {
		return projects;
	}

	public void setProjects(Set<Projects> projects) {
		this.projects = projects;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", firstName=" + firstName + ", LastName=" + LastName + "]";
	}
	
	
}
