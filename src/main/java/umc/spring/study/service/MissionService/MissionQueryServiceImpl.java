package umc.spring.study.service.MissionService;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.study.domain.enums.MissionStatus;
import umc.spring.study.domain.mapping.Stores;
import umc.spring.study.domain.mapping.UserMission;
import umc.spring.study.repository.MissionRepository.MissionRepository;
import umc.spring.study.repository.StoreRepository.StoreRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MissionQueryServiceImpl implements MissionQueryService {
    private final MissionRepository missionRepository;

    @Override
    public Page<UserMission> getMyMissionsByStatus(Long userId, MissionStatus status, Pageable pageable) {
        return missionRepository.findByUserIdAndMissionStatus(userId, status, pageable);
    }
}
