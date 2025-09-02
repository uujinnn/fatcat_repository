package com.project.fatcat.supportBoard.answer;

import java.time.LocalDateTime;

import com.project.fatcat.supportBoard.question.Question;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Answer {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id; // 답변 ID
//
//	@Column(columnDefinition = "TEXT")
//	private String content; // 답변 내용
//	
//	private LocalDateTime createDate; // 작성일
//	
//	private LocalDateTime updatedAt; // 수정일 (필요 시)
//	
//	private String admin; // 관리자 ID
//
//	// 🔑 Answer ↔ Question N:1 관계
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "question_id")
//	private Question question;

}
