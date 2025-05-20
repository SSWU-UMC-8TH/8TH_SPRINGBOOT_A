package umc.spring.study.repository.MissionRepository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import umc.spring.study.domain.enums.MissionStatus;
import umc.spring.study.domain.mapping.QUserMission;
import umc.spring.study.domain.mapping.UserMission;

import java.util.List;

@RequiredArgsConstructor
public class MissionRepositoryImpl implements MissionRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public Page<UserMission> findByUserIdAndMissionStatus(Long userId, MissionStatus status, Pageable pageable) {
        QUserMission userMission = QUserMission.userMission;

        List<UserMission> content = jpaQueryFactory
                .selectFrom(userMission)
                .where(
                    userMission.users.userId.eq(userId),
                    userMission.missionStatus.eq(status)
                )
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        long total = jpaQueryFactory
                .selectFrom(userMission)
                .where(
                        userMission.users.userId.eq(userId),
                        userMission.missionStatus.eq(status)
                )
                .fetchCount();

        return new PageImpl<>(content, pageable, total);
    }
}
