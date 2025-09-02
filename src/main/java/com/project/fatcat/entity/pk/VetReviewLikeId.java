package com.project.fatcat.entity.pk;

import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class VetReviewLikeId implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	@Column(name = "vet_review_seq")
	private Integer vetReviewSeq;

	@Column(name = "user_seq")
	private Integer userSeq;
}
