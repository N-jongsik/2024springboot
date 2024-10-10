package com.sample.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "test")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 자동으로 1씩 증가
	private Long id;
	private String name;
	private Integer age;

	public TestEntity(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public void changeNameAndAge(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

}
