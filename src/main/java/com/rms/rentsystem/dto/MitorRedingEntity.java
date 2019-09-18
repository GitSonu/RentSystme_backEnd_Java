package com.rms.rentsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Mitor_rending")
public class MitorRedingEntity {

	@Id
	@GeneratedValue
	private Integer mitorRedingId;
	
	@Column
	private Integer lastMonthReding;
	
	@Column
	private Integer  currentMonthReding;
	
	@Column
	private Double redingAmount;
	
	@Column
	private Double redingBorrowAmount;
	@Column
	private String discription;
	
	@ManyToOne
	private UserEntity user;

	/**
	 * @return the mitorRedingId
	 */
	public Integer getMitorRedingId() {
		return mitorRedingId;
	}

	/**
	 * @param mitorRedingId the mitorRedingId to set
	 */
	public void setMitorRedingId(Integer mitorRedingId) {
		this.mitorRedingId = mitorRedingId;
	}

	/**
	 * @return the lastMonthReding
	 */
	public Integer getLastMonthReding() {
		return lastMonthReding;
	}

	/**
	 * @param lastMonthReding the lastMonthReding to set
	 */
	public void setLastMonthReding(Integer lastMonthReding) {
		this.lastMonthReding = lastMonthReding;
	}

	/**
	 * @return the currentMonthReding
	 */
	public Integer getCurrentMonthReding() {
		return currentMonthReding;
	}

	/**
	 * @param currentMonthReding the currentMonthReding to set
	 */
	public void setCurrentMonthReding(Integer currentMonthReding) {
		this.currentMonthReding = currentMonthReding;
	}

	/**
	 * @return the redingAmount
	 */
	public Double getRedingAmount() {
		return redingAmount;
	}

	/**
	 * @param redingAmount the redingAmount to set
	 */
	public void setRedingAmount(Double redingAmount) {
		this.redingAmount = redingAmount;
	}

	/**
	 * @return the redingBorrowAmount
	 */
	public Double getRedingBorrowAmount() {
		return redingBorrowAmount;
	}

	/**
	 * @param redingBorrowAmount the redingBorrowAmount to set
	 */
	public void setRedingBorrowAmount(Double redingBorrowAmount) {
		this.redingBorrowAmount = redingBorrowAmount;
	}

	/**
	 * @return the discription
	 */
	public String getDiscription() {
		return discription;
	}

	/**
	 * @param discription the discription to set
	 */
	public void setDiscription(String discription) {
		this.discription = discription;
	}

	/**
	 * @return the user
	 */
	public UserEntity getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(UserEntity user) {
		this.user = user;
	}
	
}
