package umc.spring.study.repository.RegionRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import umc.spring.study.web.dto.MissionResponse;

public interface RegionRepositoryCustom {
    Page<MissionResponse> findMissionsByRegionId(Long regionId, Pageable pageable);
}
