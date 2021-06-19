package com.learnersAcademy.models;
import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.learnersAcademy.generators.StringPrefixSequenceIdGeneratorStudents;
import com.learnersAcademy.generators.StringPrefixSequenceIdGeneratorTeachers;

@Entity
@Table(name = "teachers")
public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name="teacherID")
//    private int teacherID;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="tchID" )
    @GenericGenerator(
    		name = "tchID",
    		strategy = "com.learnersAcademy.generators.StringPrefixSequenceIdGeneratorTeachers",
    		parameters = {
    				@Parameter(name = StringPrefixSequenceIdGeneratorTeachers.INCREMENT_PARAM, value = "10"),
//    				@Parameter(name = StringPrefixSequenceIdGenerator.VALUE_PREFIX_DEFAULT, value = "CL_"),
    				@Parameter(name = StringPrefixSequenceIdGeneratorTeachers.NUMBER_FORMAT_PARAMETER, value = "%03d") })
    
    private String teacherID;
    
    
    public String getTeacherID() {
		return teacherID;
	}

	@Column(name = "first_name")
    private String firstName;
    
    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "gender")
    private String gender;
    
    @Column(name = "classID")
    private String classID;
    
    public String getClassID() {
		return classID;
	}

	public void setClassID(String classID) {
		this.classID = classID;
	}

	@Column(name = "date_of_birth")
    private String dateOfBirth;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "phone")
    private String phone;
    
    @Column(name = "address")
    private String address;
    
	@Column(name = "qualification" )
    private String qualification;
    
    @Column(name = "teachingGroup")
    private String teachingGroup;
    
    @Column(name = "experience")
    private int experience;
    
    @Column(name = "annual_Salary")
    private double salary;   
    
    @Column(name = "insert_date")
    @CreationTimestamp
    private Timestamp insert_date;
    
    public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getTeachingGroup() {
		return teachingGroup;
	}

	public void setTeachingGroup(String teachingGroup) {
		this.teachingGroup = teachingGroup;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	
    
}