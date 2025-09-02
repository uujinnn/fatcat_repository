package com.project.fatcat.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "products")
public class Product {

	@Id
	@Column(name = "product_code")
	private String product_code;
	
	@Column(name = "product_name", nullable = false)
	private String product_name;
	
	@Column(name = "product_content")
	private String product_content;
	
	@Column(name = "product_price", nullable = false)
	private Integer product_price;
	
	@Column(name = "product_stock", nullable = false)
	private Integer product_stock;
	
	@Column(name = "category", nullable = false)
	private String category;
	
	@Column(name = "sub_category", nullable = false)
	private String sub_category;
	
	@Column(name = "detail_category")
	private String detail_category;
	
	@Column(name = "create_date", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime create_date;
	
	@Column(name = "update_date")
	private LocalDateTime update_date;
	
	@Builder.Default
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private List<ProductImage> productImageList = new ArrayList<>();
	
	@Builder.Default
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private List<CartItem> cartItemList = new ArrayList<>();
	
	@Builder.Default
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private List<OrderItem> orderItemList = new ArrayList<>();

}