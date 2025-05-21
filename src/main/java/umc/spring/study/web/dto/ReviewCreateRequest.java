package umc.spring.study.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewCreateRequest {
    private Long userId;
    private Long storeId;
    private Long reviewImgId; // 이미지가 필수가 아니면 nullable 처리
    private String content;
    private int score;
}