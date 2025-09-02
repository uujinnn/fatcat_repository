package com.project.fatcat.entity;



import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.project.fatcat.entity.enums.CareBoardStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name = "care_service_boards")
public class CareServiceBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "care_seq")
    private Integer care_seq;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_seq")
    private User user;
    
    @Column(name = "care_title", nullable = false)
    private String care_title;
    
    @Column(name = "care_content")
    private String care_content;
    
    @Column(name = "view_count", nullable = false, columnDefinition = "INT DEFAULT 0")
    private Integer view_count;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private CareBoardStatus status = CareBoardStatus.OPEN;
    
    @Column(name = "address1", nullable = false)
    private String address1;
    
    @Column(name = "address2", nullable = false)
    private String address2;
    
    @Column(name = "latitude", nullable = false)
    private Double latitude;
    
    @Column(name = "longitude", nullable = false)
    private Double longitude;
    
    @Column(name = "price", nullable = false)
    private Integer price;
    
    @Column(name = "create_date", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime create_date;
    
    @Column(name = "update_date")
    private LocalDateTime update_date;
    
    @Column(name = "is_deleted", columnDefinition = "BOOLEAN DEFAULT 0")
    private Boolean is_deleted;
    
    @OneToMany(mappedBy = "careServiceBoard", cascade = CascadeType.ALL)
    private List<CareSession> careSessionList = new ArrayList<>();


}