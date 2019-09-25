package com.carlton.demo.entity;

/***
 * 测试实体
* <p>Title: User</p>  
* <p>Description: </p>  
* @author Carlton  
* @date 2018年9月28日
 */
public class User {
	private Integer id;

	private String name;

	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}