package com.project.fatcat.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
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
@Table(name = "order_items", uniqueConstraints = {@UniqueConstraint(name = "uq_order_items", columnNames = {"order_seq", "product_code"})})
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_seq")
    private Integer order_item_seq;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_seq", nullable = true)
    private Order orderInfo;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_code", nullable = true)
    private Product product;
    
    @Column(name = "product_quantity", nullable = false)
    private Integer product_quantity;
    
    @Column(name = "product_price", nullable = false)
    private Integer product_price;
    
    @Column(name = "discount_total", nullable = false)
    private Integer discount_total;
    
    @Column(name = "total_price", nullable = false)
    private Integer total_price;


}