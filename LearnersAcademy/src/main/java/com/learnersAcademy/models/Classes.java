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

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.learnersAcademy.generators.StringPrefixSequenceIdGeneratorClasses;
import com.learnersAcademy.util.HibernateUtil;

@Entity
@Table(name = "classes")
public class Classes implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="classID" )
    @GenericGenerator(
    		name = "classID",
    		strategy = "com.learnersAcademy.generators.StringPrefixSequenceIdGeneratorClasses",
    		parameters = {
    				@Parameter(name = StringPrefixSequenceIdGeneratorClasses.INCREMENT_PARAM, value = "10"),
//    				@Parameter(name = StringPrefixSequenceIdGenerator.VALUE_PREFIX_DEFAULT, value = "CL_"),
    				@Parameter(name = StringPrefixSequenceIdGeneratorClasses.NUMBER_FORMAT_PARAMETER, value = "%03d") })
    
    
    private String classID;
    
    

    public String getClassID() {
		return classID;
	}

	@Column(name = "classname")
    private String classname;
    
    @Column(name = "section")
    private String section;
    
    @Column(name = "groupname")
    private String groupname;
    
    @Column(name = "stream")
    private String stream;
    
    @Column(name = "notes" )
    private String notes;
    
    
    @Column(name = "insert_date")
    @CreationTimestamp
    private Timestamp insert_date;
    
    
    
  

	public String getClassname() {
		return classname;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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

	public String getGroup() {
		return groupname;
	}
	
	

	/*
	 * public String getCreatedat() { return createdAt; }
	 * 
	 * public void setCreatedat(String createdat) { this.createdAt = createdat; }
	 */
	public void setGroup(String group) {
		this.groupname = group;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}
	
	/*
	 * public static void main(String [] args) { Classes classes = new Classes();
	 * classes.setClassname("XI"); classes.setSection("C");
	 * classes.setGroup("Secondary"); classes.setStream("Science");
	 * classes.setNotes("Trying harder");
	 * 
	 * SessionFactory sf= HibernateUtil.getSessionFactory(); Session s =
	 * sf.openSession(); Transaction t = s.beginTransaction(); s.save("Classes",
	 * classes); t.commit(); s.close(); sf.close(); }
	 */
}
