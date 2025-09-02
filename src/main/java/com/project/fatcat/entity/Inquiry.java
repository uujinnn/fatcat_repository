package com.project.fatcat.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "inquiry")
public class Inquiry {

	@Id
	@Column(name = "inquiry_seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer inquiry_seq;
	
	@Column(name = "user_seq")
	private Integer user_seq;
	
	@Column(name = "inquiry_title", nullable = false)
	private String inquiry_title;
	
	@Column(name = "inquiry_content", nullable = false)
	private String inquiry_content;
	
	@Column(name = "create_date", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime create_date;
	
	@Column(name = "update_date")
	private LocalDateTime update_date;
	
	@Column(name = "view_count", nullable = false, columnDefinition = "INT DEFAULT 0")
	private Integer view_count;
	
	@Column(name = "is_deleted", columnDefinition = "BOOLEAN DEFAULT 0")
	private Boolean is_deleted;
	
	@Builder.Default
	@OneToMany(mappedBy = "inquiry", cascade = CascadeType.ALL)
	private List<InquiryComment> inquiryCommentList = new ArrayList<>();

}