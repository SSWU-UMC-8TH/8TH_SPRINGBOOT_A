package umc.spring.study.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.study.domain.common.BaseEntity;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor

public class Reviews extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Stores stores;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "review_img_id")
    private ReviewImg reviewImg;

    @Column(nullable = false, length = 1024)
    private String content;

    @Column(nullable = false, columnDefinition = "int DEFAULT 0")
    private int score;

    @Override
    public String toString() {
        return "Reviews{" +
                "reviewId=" + reviewId +
                ", users=" + (users != null ? users.getName() : "N/A") +
                ", stores=" + (stores != null ? stores.getName() : "N/A") +
                ", reviewImg=" + (reviewImg != null ? reviewImg.getReviewImgUrl() : "N/A") +
                ", content='" + content + '\'' +
                ", score=" + score +
                '}';
    }

}