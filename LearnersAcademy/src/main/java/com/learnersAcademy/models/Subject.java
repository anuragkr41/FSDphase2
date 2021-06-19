package com.learnersAcademy.models;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.learnersAcademy.generators.StringPrefixSequenceIdGeneratorSubjects;

@Entity
@Table(name = "subjects")
public class Subject implements Serializable {
    private static final long serialVersionUID = 1L;

    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="subID" )
    @GenericGenerator(
    		name = "subID",
    		strategy = "com.learnersAcademy.generators.StringPrefixSequenceIdGeneratorSubjects",
    		parameters = {
    				@Parameter(name = StringPrefixSequenceIdGeneratorSubjects.INCREMENT_PARAM, value = "10"),
//    				@Parameter(name = StringPrefixSequenceIdGenerator.VALUE_PREFIX_DEFAULT, value = "CL_"),
    				@Parameter(name = StringPrefixSequenceIdGeneratorSubjects.NUMBER_FORMAT_PARAMETER, value = "%03d") })
    
    private String subjectID;

    public String getSubjectID() {
		return subjectID;
	}
    
	@Column(name = "subject_name")
    private String subjectName;
    
    
    @Column(name = "classID")
    private String classID;
    
    @Column(name = "classes")
    private String classes;
    
    @Column(name = "section")
    private String section;
    
    @Column(name = "insert_date")
    @CreationTimestamp
    private Timestamp insert_date;


	public String getSubjectName() {
		return subjectName;
	}


	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}


	public String getClassID() {
		return classID;
	}


	public void setClassID(String classID) {
		this.classID = classID;
	}


	public String getClasses() {
		return classes;
	}


	public void setClasses(String classes) {
		this.classes = classes;
	}


	public String getSection() {
		return section;
	}


	public void setSection(String section) {
		this.section = section;
	}
    
	
    

}