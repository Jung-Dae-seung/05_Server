package edu.kh.jsp2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok.jar 라이브러리 이용 방법
// 1) lombok 기능을 이용하고자 하는 프로젝트의 lib 폴더에 lombok.jar 추가
// 2) lombok 이용하는 IDE 에 설치해주기

@Data // Getter + Setter + toString
// @Getter
// @Setter
// @ToString
@NoArgsConstructor		// 기본생성자
@AllArgsConstructor		// 모든필드초기화용 매개변수생성자
public class Book {

	// 필드
	private String title;
	private String writer;
	private int price;
	// 메서드 (생성자, getter/setter/toString
	
}
