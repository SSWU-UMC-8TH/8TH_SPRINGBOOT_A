package umc.spring.study.web.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class MissionResponse {
    private Long missionId;
    private String content;
    private Long storeId;
    private Integer point;
    private LocalDate deadline;

    // 생성자 추가 (QueryDSL Projections.constructor에 필요)
    public MissionResponse(Long missionId, String content, Long storeId, Integer point, LocalDate deadline) {
        this.missionId = missionId;
        this.content = content;
        this.storeId = storeId;
        this.point = point;
        this.deadline = deadline;
    }
}
