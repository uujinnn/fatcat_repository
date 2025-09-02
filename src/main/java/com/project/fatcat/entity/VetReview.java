package com.project.fatcat.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name = "vet_reviews")
public class VetReview {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vet_review_seq")
	private Integer vet_review_seq;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vet_seq", nullable = true)
	private VetClinic vetClinic;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_seq", nullable = true)
	private User user;
	
	@Column(name = "vet_review", nullable = false)
	private String vet_review;
	
	@Column(name = "vet_rating", nullable = false)
	private Integer vet_rating;
	
	@Column(name = "visit_date", nullable = false)
	private LocalDateTime visit_date;
	
	@Column(name = "helpful_count", columnDefinition = "INT DEFAULT 0")
	private Integer helpful_count;
	
	@Column(name = "create_date", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime create_date;
	
	@Column(name = "update_date")
	private LocalDateTime update_date;
	
	@Builder.Default
	@OneToMany(mappedBy = "vetReview", cascade = CascadeType.ALL)
	private List<VetReviewLike> vetReviewLikeList = new ArrayList<>();

}