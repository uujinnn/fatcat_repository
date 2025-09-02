package com.project.fatcat.entity;



import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.project.fatcat.entity.enums.CareSessionStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "care_sessions")
public class CareSession {

    @Id
    @Column(name = "session_seq")
    private Integer session_seq;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "care_seq", nullable = true)
    private CareServiceBoard careServiceBoard;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_user_seq", nullable = true)
    private User ownerUser;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sitter_user_seq", nullable = true)
    private User sitterUser;
    
    @Column(name = "start_date", nullable = false)
    private LocalDateTime start_date;
    
    @Column(name = "end_date", nullable = false)
    private LocalDateTime end_date;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private CareSessionStatus status = CareSessionStatus.REQUESTED;
    
    @OneToMany(mappedBy = "careSession", cascade = CascadeType.ALL)
    private List<CareServiceReview> careServiceReviewList = new ArrayList<>();


}