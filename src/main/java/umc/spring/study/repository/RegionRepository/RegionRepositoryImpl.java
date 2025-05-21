package umc.spring.study.repository.RegionRepository;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import umc.spring.study.domain.mapping.QMissions;
import umc.spring.study.domain.mapping.QRegions;
import umc.spring.study.domain.mapping.QStores;
import umc.spring.study.web.dto.MissionResponse;

import java.util.List;

@RequiredArgsConstructor
public class RegionRepositoryImpl implements RegionRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public Page<MissionResponse> findMissionsByRegionId(Long regionId, Pageable pageable) {
        QRegions regions = QRegions.regions;
        QStores stores = QStores.stores;
        QMissions missions = QMissions.missions;

        // 1. 데이터 조회 (페이징 적용)
        List<MissionResponse> content = jpaQueryFactory
                .select(Projections.constructor(
                        MissionResponse.class,
                        missions.missionId,
                        missions.content,
                        stores.storeId,
                        missions.point,
                        missions.deadline
                ))
                .from(missions)
                .join(missions.stores, stores)         // Mission → Store 조인
                .join(stores.regions, regions)          // Store → Region 조인
                .where(
                        regions.regionId.eq(regionId)     // 선택된 지역 ID 조건
                )
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .orderBy(missions.createdAt.desc())  // 최신순 정렬
                .fetch();

        // 2. 전체 개수 조회 (페이징용)
        long total = jpaQueryFactory
                .select(missions.count())
                .from(missions)
                .join(missions.stores, stores)
                .join(stores.regions, regions)
                .where(
                        regions.regionId.eq(regionId)
                )
                .fetchOne();

        return new PageImpl<>(content, pageable, total);
    }
}
