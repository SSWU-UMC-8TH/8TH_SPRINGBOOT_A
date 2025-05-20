package umc.spring.study.domain.mapping;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUsers is a Querydsl query type for Users
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUsers extends EntityPathBase<Users> {

    private static final long serialVersionUID = -929456063L;

    public static final QUsers users = new QUsers("users");

    public final umc.spring.study.domain.common.QBaseEntity _super = new umc.spring.study.domain.common.QBaseEntity(this);

    public final StringPath address = createString("address");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final ListPath<Alarms, QAlarms> alarmsList = this.<Alarms, QAlarms>createList("alarmsList", Alarms.class, QAlarms.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath email = createString("email");

    public final EnumPath<umc.spring.study.domain.enums.Gender> gender = createEnum("gender", umc.spring.study.domain.enums.Gender.class);

    public final ListPath<Inquiries, QInquiries> inquiriesList = this.<Inquiries, QInquiries>createList("inquiriesList", Inquiries.class, QInquiries.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final StringPath nickname = createString("nickname");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final NumberPath<Integer> point = createNumber("point", Integer.class);

    public final ListPath<PreferFood, QPreferFood> preferFoodList = this.<PreferFood, QPreferFood>createList("preferFoodList", PreferFood.class, QPreferFood.class, PathInits.DIRECT2);

    public final ListPath<Reviews, QReviews> reviewsList = this.<Reviews, QReviews>createList("reviewsList", Reviews.class, QReviews.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public final ListPath<UserMission, QUserMission> userMissionList = this.<UserMission, QUserMission>createList("userMissionList", UserMission.class, QUserMission.class, PathInits.DIRECT2);

    public final EnumPath<umc.spring.study.domain.enums.UserStatus> userStatus = createEnum("userStatus", umc.spring.study.domain.enums.UserStatus.class);

    public QUsers(String variable) {
        super(Users.class, forVariable(variable));
    }

    public QUsers(Path<? extends Users> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUsers(PathMetadata metadata) {
        super(Users.class, metadata);
    }

}

