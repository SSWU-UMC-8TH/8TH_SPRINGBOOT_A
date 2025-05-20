package umc.spring.study.web.dto;

import lombok.Builder;
import lombok.Getter;
import umc.spring.study.domain.enums.UserStatus;

@Getter
@Builder
public class MyPageResponse {
    private String nickname;
    private String email;
    private int point;
    private UserStatus userStatus;
    private long ongoingMissionsCount;     // 진행중 미션 개수
    private long completedMissionsCount;   // 완료 미션 개수
    private long totalReviewsCount;        // 작성 리뷰 개수

    // 필요시 생성자 추가
    public MyPageResponse(String nickname, String email, int point, UserStatus userStatus,
                          long ongoingMissionsCount, long completedMissionsCount, long totalReviewsCount) {
        this.nickname = nickname;
        this.email = email;
        this.point = point;
        this.userStatus = userStatus;
        this.ongoingMissionsCount = ongoingMissionsCount;
        this.completedMissionsCount = completedMissionsCount;
        this.totalReviewsCount = totalReviewsCount;
    }
}