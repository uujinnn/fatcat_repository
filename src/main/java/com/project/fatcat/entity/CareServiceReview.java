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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "care_service_reviews")
public class CareServiceReview {

    @Id
    @Column(name = "care_review_seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer care_review_seq;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "session_seq", nullable = true)
    private CareSession careSession;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_user_seq", nullable = true)
    private User authorUser;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "target_user_seq", nullable = true)
    private User targetUser;
    
    @Column(name = "target_role", nullable = false)
    private String target_role;
    
    @Column(name = "care_rating", nullable = false)
    private Integer care_rating;
    
    @Column(name = "care_review", nullable = false)
    private String care_review;
    
    @Column(name = "create_date", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime create_date;
    
    @Column(name = "update_date")
    private LocalDateTime update_date;
    
    @Column(name = "is_deleted", columnDefinition = "BOOLEAN DEFAULT 0")
    private Boolean is_deleted;


}