package umc.spring.study.service.RegionService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import umc.spring.study.web.dto.MissionResponse;

public interface RegionQueryService {
    Page<MissionResponse> getAvailableMissions(Long regionId, Pageable pageable);
}