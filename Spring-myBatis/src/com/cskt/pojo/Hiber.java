package com.cskt.pojo;

public class Hiber {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Hiber [id=" + id + ", name=" + name + "]";
	}
	public Hiber() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}
	public Hiber(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
