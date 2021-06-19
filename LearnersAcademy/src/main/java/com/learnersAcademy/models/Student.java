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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.learnersAcademy.generators.StringPrefixSequenceIdGeneratorClasses;
import com.learnersAcademy.generators.StringPrefixSequenceIdGeneratorStudents;

@Entity
@Table(name = "students")
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="stuID" )
    @GenericGenerator(
    		name = "stuID",
    		strategy = "com.learnersAcademy.generators.StringPrefixSequenceIdGeneratorStudents",
    		parameters = {
    				@Parameter(name = StringPrefixSequenceIdGeneratorStudents.INCREMENT_PARAM, value = "10"),
//    				@Parameter(name = StringPrefixSequenceIdGenerator.VALUE_PREFIX_DEFAULT, value = "CL_"),
    				@Parameter(name = StringPrefixSequenceIdGeneratorStudents.NUMBER_FORMAT_PARAMETER, value = "%03d") })
    
    private String studentID;

    public String getStudentID() {
		return studentID;
	}

	@Column(name = "first_name")
    private String firstName;
    
    @Column(name = "last_name")
    private String lastName;
    
//    @ManyToOne
//    @JoinColumn(name = "Student_Class_ID")
//    private Classes classname;
//    
    
    @Column(name = "classname")
    private String classname;
    
    @Column(name = "section")
    private String section;
    
    

//    public void setClassname(Classes classname) {
//		this.classname = classname;
//	}
//    
//    
//
//	public Classes getClassname() {
//		return classname;
//	}

	@Column(name = "gender")
    private String gender;
    
    @Column(name = "fathers_name")
    private String fathersName;
    
    @Column(name = "mothers_name")
    private String mothersName;
    
    @Column(name = "address")
    private String address;
    
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    
    @Column(name = "emergency_Contact")
    private String contact;
   

    @Column(name = "blood_group")
    private String bloodGroup;
    
    @Column(name = "insert_date")
    @CreationTimestamp
    private Timestamp insert_date;

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

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getMothersName() {
		return mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	



//	public Student(String firstName, String lastName, Classes classname, String gender, String fathersName,
//			String mothersName, String address, String dateOfBirth, String contact, String bloodGroup) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.classname = classname;
//		this.gender = gender;
//		this.fathersName = fathersName;
//		this.mothersName = mothersName;
//		this.address = address;
//		this.dateOfBirth = dateOfBirth;
//		this.contact = contact;
//		this.bloodGroup = bloodGroup;
//	}



	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", classname=" + classname + ", gender=" + gender + ", fathersName=" + fathersName + ", mothersName="
				+ mothersName + ", address=" + address + ", dateOfBirth=" + dateOfBirth + ", contact=" + contact
				+ ", bloodGroup=" + bloodGroup + ", insert_date=" + insert_date + "]";
	}

	
	    
}