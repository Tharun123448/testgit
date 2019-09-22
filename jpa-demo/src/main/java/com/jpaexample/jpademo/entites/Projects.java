package com.jpaexample.jpademo.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Projects {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int projectId;
	private String projectName;
	
	@ManyToOne
	@JoinColumn(name="managerId")
	private int  managerId;

	public Projects() {
	}
	public Projects(String projectName) {
		this.projectName = projectName;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	@Override
	public String toString() {
		return "Projects [projectId=" + projectId + ", projectName=" + projectName + ", managerId=" + managerId + "]";
	}

}
