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
@Table(name = "knowledge_boards")
public class KnowledgeBoard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "board_seq")
	private Integer board_seq;
	
	@Column(name = "board_code", nullable = false)
	private String board_code;
	
	@Column(name = "create_date", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime create_date;
	
	@Column(name = "update_date")
	private LocalDateTime update_date;
	
	@Builder.Default
	@OneToMany(mappedBy = "knowledgeBoard", cascade = CascadeType.ALL)
	private List<KnowledgePost> knowledgePostList = new ArrayList<>();

}