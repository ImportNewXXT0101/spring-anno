package com.xxt.spring.cap1;

import com.xxt.spring.cap1.entity.Dog;

public class Person {
	private String name;
	private Integer age;
	private Dog dog;

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public Person(){
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(String name, Integer age) {
		super();
		System.out.println("-->new person");
		this.name = name;
		this.age = age;
	}
	public Integer getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", dog=" + dog + "]";
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
