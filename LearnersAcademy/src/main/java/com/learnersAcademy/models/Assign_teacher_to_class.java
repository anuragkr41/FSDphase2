package com.learnersAcademy.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity
public class Assign_teacher_to_class {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@Column
	String teacher_id;
	@Column
	String subject_id;
	@Column
	String class_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(String subject_id) {
		this.subject_id = subject_id;
	}
	public String getClass_id() {
		return class_id;
	}
	public void setClass_id(String class_id) {
		this.class_id = class_id;
	}
	public Assign_teacher_to_class(String teacher_id, String subject_id, String class_id) {
		super();
		this.teacher_id = teacher_id;
		this.subject_id = subject_id;
		this.class_id = class_id;
	}
	public Assign_teacher_to_class(int id, String teacher_id, String subject_id, String class_id) {
		super();
		this.id = id;
		this.teacher_id = teacher_id;
		this.subject_id = subject_id;
		this.class_id = class_id;
	}
	public Assign_teacher_to_class() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Assign_teacher_to_class [id=" + id + ", teacher_id=" + teacher_id + ", subject_id=" + subject_id
				+ ", class_id=" + class_id + "]";
	}
	
	
	

}
