package com.yashtojava.springboot.learn_spring_boot;

public class Course {
	public long id;
	public String name;
	public String auther;

	public Course(long id, String name, String auther) {
		super();
		this.id = id;
		this.name = name;
		this.auther = auther;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuther() {
		return auther;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", auther=" + auther + "]";
	}

}
