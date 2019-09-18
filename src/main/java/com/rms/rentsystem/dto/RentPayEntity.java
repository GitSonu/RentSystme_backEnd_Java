package com.rms.rentsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rent_pay")
public class RentPayEntity {

	@Id
	@GeneratedValue
	private Integer rentId;
	
	@Column
	private Double currentPay;
	
	@Column
	private Double lastPay;
	
	@ManyToOne
	private UserEntity user;

	/**
	 * @return the rentId
	 */
	public Integer getRentId() {
		return rentId;
	}

	/**
	 * @param rentId the rentId to set
	 */
	public void setRentId(Integer rentId) {
		this.rentId = rentId;
	}

	/**
	 * @return the currentPay
	 */
	public Double getCurrentPay() {
		return currentPay;
	}

	/**
	 * @param currentPay the currentPay to set
	 */
	public void setCurrentPay(Double currentPay) {
		this.currentPay = currentPay;
	}

	/**
	 * @return the lastPay
	 */
	public Double getLastPay() {
		return lastPay;
	}

	/**
	 * @param lastPay the lastPay to set
	 */
	public void setLastPay(Double lastPay) {
		this.lastPay = lastPay;
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
