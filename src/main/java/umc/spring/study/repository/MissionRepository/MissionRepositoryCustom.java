package umc.spring.study.repository.MissionRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import umc.spring.study.domain.enums.MissionStatus;
import umc.spring.study.domain.mapping.UserMission;

public interface MissionRepositoryCustom {
    Page<UserMission> findByUserIdAndMissionStatus(Long userId, MissionStatus status, Pageable pageable);
}
