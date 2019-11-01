package com.exercise27helloworld.model;

public class UserModel {
	private short age;
	private String name;
	private int id;
	
	public UserModel() {
		
	}
	public UserModel(short age, String name, int id) {
		this.age = age;
		this.name = name;
		this.id = id;
	}
	public short getAge() {
		return this.age;
	}
	public void setAge(short age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getID() {
		return this.id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
}
