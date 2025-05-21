package umc.spring.study.repository.UserRepository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import umc.spring.study.domain.mapping.QUsers;
import umc.spring.study.domain.mapping.QUserMission;
import umc.spring.study.domain.mapping.QReviews;
import umc.spring.study.domain.mapping.Users;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;
    private final QUsers users = QUsers.users;
    private final QUserMission userMission = QUserMission.userMission;
    private final QReviews reviews = QReviews.reviews;

    @Override
    public Optional<Users> findUserWithDetails(Long userId) {
        Users result = jpaQueryFactory
                .selectFrom(users)
                .leftJoin(users.userMissionList, userMission).fetchJoin()
                .leftJoin(users.reviewsList, reviews).fetchJoin()
                .where(users.userId.eq(userId))
                .fetchOne();

        return Optional.ofNullable(result);
    }
}