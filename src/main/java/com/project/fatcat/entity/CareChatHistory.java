package com.project.fatcat.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "care_chat_historys")
public class CareChatHistory {

	@Id
	@Column(name = "chat_history_seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer chat_history_seq;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "chat_seq", nullable = true)
	private CareChatRoom careChatRoom;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_seq", nullable = true)
	private User user;
	
	@Column(name = "chat_message", nullable = false)
	private String chat_message;
	
	@Column(name = "chat_date", nullable = false)
	private LocalDateTime chat_date;
	
	@Column(name = "chat_sender", nullable = false)
	private String chat_sender;

}