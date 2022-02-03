package com.trainingcenter.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



@Entity
@Table(name="training_centers")
public class TrainingCenter {
	
	@Id
	@NotNull
	@Size(min = 12, max = 12, message = "center code size must be exactly 12 character")
	private String centerCode;
	
	@NotBlank
	@Size(max = 40, message = "center name must be less than 40 character")
	private String centerName;
	
	private int studentCapacity;
	
	@ElementCollection
	private List<String> coursesOffered;
	
	@Email(message = "enter a valid email")
	private String contactEmail;
	
	@NotNull
	@Pattern(regexp="(^$|[0-9]{10})", message = "Enter a valid number")
	private String contactPhone;
	
	@Temporal(value=TemporalType.DATE)
    private Date createdOn;
	

	@OneToOne(cascade = CascadeType.ALL)
	@NotNull
	private Address address;
	
	public TrainingCenter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TrainingCenter(String centerCode, String centerName, int studentCapacity, List<String> coursesOffered,
			String contactEmail, String contactPhone,Date createdOn, Address address) {
		super();
		this.centerCode = centerCode;
		this.centerName = centerName;
		this.studentCapacity = studentCapacity;
		this.coursesOffered = coursesOffered;
		this.contactEmail = contactEmail;
		this.contactPhone = contactPhone;
		this.createdOn=createdOn;
		this.address = address;
	}

	public String getCenterCode() {
		return centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public int getStudentCapacity() {
		return studentCapacity;
	}

	public void setStudentCapacity(int studentCapacity) {
		this.studentCapacity = studentCapacity;
	}

	public List<String> getCoursesOffered() {
		return coursesOffered;
	}

	public void setCoursesOffered(List<String> coursesOffered) {
		this.coursesOffered = coursesOffered;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	


	
}
