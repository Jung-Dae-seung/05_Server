package edu.kh.todolist.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data	// Getter + Setter + toString
@NoArgsConstructor
@AllArgsConstructor
public class Todo implements Serializable{

	private String title;		// 제목
	private String detail;		// 상세내용
	// + 완료여부
	// + 등록날짜
	
}
