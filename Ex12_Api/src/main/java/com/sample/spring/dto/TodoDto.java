package com.sample.spring.dto;

import java.time.LocalDate;

import com.sample.spring.model.TodoEntity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoDto {
	
	private Long tno;
	private String title;		
	private String writer;
	private boolean complete;
	private LocalDate dueDate;
}
