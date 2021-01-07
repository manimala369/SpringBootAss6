package com.demo.entities;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="student_table")
public class Student {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int  stdId;
	private String sname;
	
	@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Course> course=new ArrayList<>();

	public Student() {
	}

	public Student(String sname) {
		this.sname = sname;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	
	
}
