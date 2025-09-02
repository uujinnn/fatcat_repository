package com.project.fatcat.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "vet_rating_avg")
public class VetRatingAvg {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vet_rating_seq")
	private Integer vet_rating_seq;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vet_seq")
	private VetClinic vetClinic;
	
	@Column(name = "rating_count", nullable = false)
	private Integer rating_count;
	
	@Column(name = "rating_sum", nullable = false)
	private Integer rating_sum;
	
	@Column(name = "rating_avg", nullable = false)
	private BigDecimal rating_avg;
	
	@Column(name = "last_review_date")
	private LocalDateTime last_review_date;

}