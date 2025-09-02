package com.project.fatcat.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name = "vet_clinics")
public class VetClinic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vet_seq")
	private Integer vet_seq;
	
	@Column(name = "clinic_name", nullable = false)
	private String clinic_name;
	
	@Column(name = "clinic_number")
	private String clinic_number;
	
	@Column(name = "clinic_city", nullable = false)
	private String clinic_city;
	
	@Column(name = "clinic_town", nullable = false)
	private String clinic_town;
	
	@Column(name = "clinic_address")
	private String clinic_address;
	
	@Column(name = "latitude", nullable = false)
	private Double latitude;
	
	@Column(name = "longitude", nullable = false)
	private Double longitude;
	
	@Column(name = "is_cat_room")
	private Boolean is_cat_room;
	
	@Column(name = "is_emergency")
	private Boolean is_emergency;
	
	@Column(name = "is_24h")
	private Boolean is_24h;
	
	@Column(name = "has_parking")
	private Boolean has_parking;
	
	@Column(name = "closed_day")
	private String closed_day;
	
	@Column(name = "open_time")
	private String open_time;
	
	@Column(name = "close_time")
	private String close_time;
	
	@Column(name = "break_start")
	private String break_start;
	
	@Column(name = "break_end")
	private String break_end;
	
	@Column(name = "clinic_image_url")
	private String clinic_image_url;
	
	@Column(name = "create_date", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime create_date;
	
	@Column(name = "update_date")
	private LocalDateTime update_date;
	
	@Builder.Default
	@OneToMany(mappedBy = "vetClinic", cascade = CascadeType.ALL)
	private List<VetReview> vetReviewList = new ArrayList<>();
	
	@Builder.Default
	@OneToMany(mappedBy = "vetClinic", cascade = CascadeType.ALL)
	private List<VetRatingAvg> vetRatingAvgList = new ArrayList<>();

}