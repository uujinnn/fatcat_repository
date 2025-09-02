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
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_seq")
	private Integer order_seq;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_seq")
	private User user;
	
	@Column(name = "order_number")
	private String order_number;
	
	@Column(name = "order_price", nullable = false)
	private Integer order_price;
	
	@Column(name = "order_name", nullable = false)
	private String order_name;
	
	@Column(name = "order_phonenum", nullable = false)
	private String order_phonenum;
	
	@Column(name = "order_address1", nullable = false)
	private String order_address1;
	
	@Column(name = "order_address2", nullable = false)
	private String order_address2;
	
	@Column(name = "latitude", nullable = false)
	private Double latitude;
	
	@Column(name = "longitude", nullable = false)
	private Double longitude;
	
	@Column(name = "order_zipcode", nullable = false)
	private String order_zipcode;
	
	@Column(name = "order_request")
	private String order_request;
	
	@Column(name = "order_date", nullable = false, columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime order_date;
	
	@Column(name = "order_status", nullable = false)
	private String order_status;
	
	@Builder.Default
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private List<Payment> paymentList = new ArrayList<>();

}