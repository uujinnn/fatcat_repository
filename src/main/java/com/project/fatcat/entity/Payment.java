package com.project.fatcat.entity;

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
@Table(name = "payments")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pay_seq")
	private Integer pay_seq;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_seq")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_seq")
	private Order order;
	
	@Column(name = "pay_price", nullable = false)
	private Integer pay_price;
	
	@Column(name = "merchant_uid", nullable = false)
	private String merchant_uid;
	
	@Column(name = "pg_provider", nullable = false)
	private String pg_provider;
	
	@Column(name = "method", nullable = false)
	private String method;
	
	@Column(name = "status", nullable = false)
	private String status;
	
	@Column(name = "pg_tid", nullable = false)
	private String pg_tid;
	
	@Column(name = "approved_date", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime approved_date;
	
	@Column(name = "failed_date")
	private LocalDateTime failed_date;
	
	@Column(name = "canceled_date")
	private LocalDateTime canceled_date;
	
}

