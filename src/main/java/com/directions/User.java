package com.directions;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *	Author: Ahmed BOUAFIF
 *	Email: bouafif.ahmed@gmail.com
 *	Since: 12 janv. 2017
 */

@Entity
@Table(name = "USER")
public class User {

	/**
	 *  ATTRIBUTES
	 */
	private long id;
	private String name;
	private String password;

	/**
	 *  ATTRIBUTES FROM RELATIONS
	 */

	/**
	 *  CUSTOM METHODS
	 */

	/**
	 *  GETTERS AND SETTERS
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
