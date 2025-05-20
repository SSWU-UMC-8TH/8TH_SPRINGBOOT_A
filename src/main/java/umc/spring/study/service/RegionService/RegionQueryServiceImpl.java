package umc.spring.study.service.RegionService;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import umc.spring.study.repository.RegionRepository.RegionRepository;
import umc.spring.study.web.dto.MissionResponse;

@Service
@RequiredArgsConstructor
public class RegionQueryServiceImpl implements RegionQueryService {
    private final JPAQueryFactory jpaQueryFactory;
    private final RegionRepository regionRepository;

    @Override
    public Page<MissionResponse> getAvailableMissions(Long regionId, Pageable pageable) {
        // RegionRepository의 커스텀 메서드 호출
        return regionRepository.findMissionsByRegionId(regionId, pageable);
    }
}