package com.rms.rentsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name ="User")
public class UserEntity {

	@Id
    @GeneratedValue
	Integer userId;
	
	@Column
	private String fristName;
	
	@Column
	private String lastName;
	
	@Column
	private String cast;
	
	@Column
	private Integer mobileNumber;
	
	@Column
	private Integer secondNumber;
	
	@Column
	private String localAddress;
	
	@Column
	private String gender;
	
	@Column
	private String votorId;
	
	@Column
	private String vicalNumber;
	
	@ManyToOne
	RoomEntity room;

	
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the fristName
	 */
	public String getFristName() {
		return fristName;
	}

	/**
	 * @param fristName the fristName to set
	 */
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the cast
	 */
	public String getCast() {
		return cast;
	}

	/**
	 * @param cast the cast to set
	 */
	public void setCast(String cast) {
		this.cast = cast;
	}

	/**
	 * @return the mobileNumber
	 */
	public Integer getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the secondNumber
	 */
	public Integer getSecondNumber() {
		return secondNumber;
	}

	/**
	 * @param secondNumber the secondNumber to set
	 */
	public void setSecondNumber(Integer secondNumber) {
		this.secondNumber = secondNumber;
	}

	/**
	 * @return the localAddress
	 */
	public String getLocalAddress() {
		return localAddress;
	}

	/**
	 * @param localAddress the localAddress to set
	 */
	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the votorId
	 */
	public String getVotorId() {
		return votorId;
	}

	/**
	 * @param votorId the votorId to set
	 */
	public void setVotorId(String votorId) {
		this.votorId = votorId;
	}

	/**
	 * @return the vicalNumber
	 */
	public String getVicalNumber() {
		return vicalNumber;
	}

	/**
	 * @param vicalNumber the vicalNumber to set
	 */
	public void setVicalNumber(String vicalNumber) {
		this.vicalNumber = vicalNumber;
	}
	
}
