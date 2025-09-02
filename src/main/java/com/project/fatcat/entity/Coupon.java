package com.project.fatcat.entity;



import jakarta.persistence.*;

import jakarta.persistence.CascadeType;

import java.util.*;

import lombok.*;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "coupons")
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coupon_seq")
    private Integer coupon_seq;
    
    @Column(name = "coupon_name", nullable = false)
    private String coupon_name;
    
    @Column(name = "coupon_discount", nullable = false)
    private Integer coupon_discount;
    
    @Column(name = "coupon_limitdate", nullable = false)
    private String coupon_limitdate;
    
    @Builder.Default
    @OneToMany(mappedBy = "coupon", cascade = CascadeType.ALL)
    private List<UserCoupon> userCouponList = new ArrayList<>();


}