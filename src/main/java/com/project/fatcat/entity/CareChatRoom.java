package com.project.fatcat.entity;



import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "care_chat_rooms")
public class CareChatRoom {

    @Id
    @Column(name = "chat_seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer chat_seq;
    
    @Column(name = "chat_name", nullable = false)
    private String chat_name;
    
    @Column(name = "chat_members", nullable = false)
    private Integer chat_members;
    
    @Column(name = "create_date", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime create_date;
    
    @Column(name = "update_date")
    private LocalDateTime update_date;


}