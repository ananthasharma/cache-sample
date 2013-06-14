/**
 * 
 */
package com.aps.test.cache.model;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author asharma
 * 
 */
public class SampleCachableBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8241632795589105307L;

	private Integer age;
	private String name;
	private String id;

	/**
	 * 
	 */
	public SampleCachableBean() {
		super();
	}

	/**
	 * @param age
	 * @param name
	 */
	public SampleCachableBean(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
		this.id = UUID.randomUUID().toString();
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("SampleCachableBean [id=%s, age=%s, name=%s]", id,
				age, name);
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

}
