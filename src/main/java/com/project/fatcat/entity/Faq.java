package com.project.fatcat.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "faqs")
public class Faq {

	@Id
	@Column(name = "faq_seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer faq_seq;

	@Column(name = "faq_code", nullable = false)
	private String faq_code;

	@Column(name = "question", nullable = false)
	private String question;

	@Column(name = "answer", nullable = false)
	private String answer;

	@Column(name = "view_count", nullable = false, columnDefinition = "INT DEFAULT 0")
	private Integer view_count;

	@Column(name = "create_date", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime create_date;

	@Column(name = "update_date")
	private LocalDateTime update_date;

}