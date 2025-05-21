package umc.spring.study.service.MissionService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import umc.spring.study.domain.enums.MissionStatus;
import umc.spring.study.domain.mapping.UserMission;

public interface MissionQueryService {
    Page<UserMission> getMyMissionsByStatus(Long userId, MissionStatus status, Pageable pageable);
}
