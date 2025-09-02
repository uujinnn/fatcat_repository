package com.project.fatcat.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_seq")
	private Integer user_seq;
	
	@Column(name = "user_email",length = 255)
	private String user_email;
	
	@Column(name = "user_password", length = 255)
	private String user_password;
	
	@Column(name = "user_name", length = 50)
	private String user_name;
	
	@Column(name = "nickname", nullable = false, length = 50)
	private String nickname;
	
	@Column(name = "phone_number", nullable = false, length = 20)
	private String phone_number;
	
	@Column(name = "address1", length = 200)
	private String address1;
	
	@Column(name = "address2", length = 200)
	private String address2;
	
	@Column(name = "latitude", nullable = false)
	private Double latitude;
	
	@Column(name = "longitude", nullable = false)
	private Double longitude;
	
	@Column(name = "role", nullable = false, length = 20)
	private String role;
	
	@Column(name = "vet_license_image")
	private String vet_license_image;
	
	@Column(name = "create_date", nullable = false, columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime create_date;
	
	@Column(name = "last_login_date")
	private LocalDateTime last_login_date;
	
	@Column(name = "is_deleted", nullable = false, columnDefinition = "BOOLEAN DEFAULT 0")
	private Boolean is_deleted;
	
	@Builder.Default
	@OneToMany(mappedBy = "user")
    private List<OauthAccount> oauthAccountsList = new ArrayList<>();

	@Builder.Default
    @OneToMany(mappedBy = "user")
    private List<Cat> catsList = new ArrayList<>();

	@Builder.Default
    @OneToMany(mappedBy = "user")
    private List<ShoppingCart> shoppingCartsList = new ArrayList<>();

	@Builder.Default
    @OneToMany(mappedBy = "user")
    private List<Order> ordersList = new ArrayList<>();

	@Builder.Default
    @OneToMany(mappedBy = "user")
    private List<Payment> paymentsList = new ArrayList<>();

	@Builder.Default
    @OneToMany(mappedBy = "user")
    private List<UserCoupon> userCouponsList = new ArrayList<>();

	@Builder.Default
    @OneToMany(mappedBy = "user")
    private List<VetReview> vetReviewsList = new ArrayList<>();

	@Builder.Default
    @OneToMany(mappedBy = "user")
    private List<VetReviewLike> vetReviewLikesList = new ArrayList<>();

	@Builder.Default
    @OneToMany(mappedBy = "user")
    private List<CareServiceBoard> careServiceBoardsList = new ArrayList<>();

	@Builder.Default
    @OneToMany(mappedBy = "ownerUser")
    private List<CareSession> careSessionOwnerList = new ArrayList<>();

	@Builder.Default
    @OneToMany(mappedBy = "sitterUser")
    private List<CareSession> careSessionSitterList = new ArrayList<>();

	@Builder.Default
    @OneToMany(mappedBy = "authorUser")
    private List<CareServiceReview> careServiceReviewAuthorList = new ArrayList<>();

	@Builder.Default
    @OneToMany(mappedBy = "targetUser")
    private List<CareServiceReview> careServiceReviewTargetList = new ArrayList<>();

	@Builder.Default
    @OneToMany(mappedBy = "user")
    private List<CareChatHistory> careChatHistorysList = new ArrayList<>();

	@Builder.Default
    @OneToMany(mappedBy = "user")
    private List<KnowledgePost> knowledgePostsList = new ArrayList<>();

	@Builder.Default
    @OneToMany(mappedBy = "user")
    private List<KnowledgeComment> knowledgeCommentsList = new ArrayList<>();

	@Builder.Default
    @OneToMany(mappedBy = "user")
    private List<InquiryComment> inquiryCommentsList = new ArrayList<>();

}