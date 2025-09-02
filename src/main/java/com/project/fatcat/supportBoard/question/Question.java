package com.project.fatcat.supportBoard.question;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.Currency;

import com.project.fatcat.supportBoard.answer.Answer;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Question {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id; // 문의글 ID
//
//	@Column(length = 200)
//	private String subject; // 제목
//	
//	@Column(columnDefinition = "TEXT")
//	private String content; // 문의 내용
//	
//	private LocalDateTime createDate; // 작성일
//
//	private String category; // 문의 유형 (계정/결제/버그/기타)
//	
//	private String writer; // 작성자 이름 or 회원 ID
//	
//	private String status; // 처리 상태 (접수, 답변완료, 보류)
//	
//	private String attachment; // 첨부파일 경로/이름 (필요하면)
//
//	// 🔑 Question ↔ Answer 1:N 관계
//	@OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
//	private List<Answer> answerList = new ArrayList<>();
	
}
