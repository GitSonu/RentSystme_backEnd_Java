package com.rms.rentsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "room_table")
public class RoomEntity {

	@Id
	@GeneratedValue
	private Integer roomId;
	
	@Column
	private String roomNo;
	
	@Column
	private String discription;
	
	@ManyToOne
	UserEntity User;

	/**
	 * @return the roomId
	 */
	public Integer getRoomId() {
		return roomId;
	}

	/**
	 * @param roomId the roomId to set
	 */
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	/**
	 * @return the roomNo
	 */
	public String getRoomNo() {
		return roomNo;
	}

	/**
	 * @param roomNo the roomNo to set
	 */
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
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
		return User;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(UserEntity user) {
		User = user;
	}
	
	
}
