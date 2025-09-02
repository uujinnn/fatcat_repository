package com.project.fatcat.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "knowledge_posts")
public class KnowledgePost {

	@Id
	@Column(name = "post_seq")
	private Integer post_seq;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "board_seq", nullable = true)
	private KnowledgeBoard knowledgeBoard;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_seq", nullable = true)
	private User user;
	
	@Column(name = "post_title", nullable = false)
	private String post_title;
	
	@Column(name = "post_content", nullable = false)
	private String post_content;
	
	@Column(name = "view_count", columnDefinition = "INT DEFAULT 0")
	private Integer view_count;
	
	@Column(name = "like_count", columnDefinition = "INT DEFAULT 0")
	private Integer like_count;
	
	@Column(name = "create_date", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime create_date;
	
	@Column(name = "update_date")
	private LocalDateTime update_date;
	
	@Column(name = "is_deleted", columnDefinition = "BOOLEAN DEFAULT 0")
	private Boolean is_deleted;
	
	@Builder.Default
	@OneToMany(mappedBy = "knowledgePost", cascade = CascadeType.ALL)
	private List<KnowledgeComment> knowledgeCommentList = new ArrayList<>();

}