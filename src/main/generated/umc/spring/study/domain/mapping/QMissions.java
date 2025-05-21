package umc.spring.study.domain.mapping;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMissions is a Querydsl query type for Missions
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMissions extends EntityPathBase<Missions> {

    private static final long serialVersionUID = -712554610L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMissions missions = new QMissions("missions");

    public final umc.spring.study.domain.common.QBaseEntity _super = new umc.spring.study.domain.common.QBaseEntity(this);

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DatePath<java.time.LocalDate> deadline = createDate("deadline", java.time.LocalDate.class);

    public final NumberPath<Long> missionId = createNumber("missionId", Long.class);

    public final QMissionImg missionImg;

    public final NumberPath<Integer> point = createNumber("point", Integer.class);

    public final QStores stores;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMissions(String variable) {
        this(Missions.class, forVariable(variable), INITS);
    }

    public QMissions(Path<? extends Missions> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMissions(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMissions(PathMetadata metadata, PathInits inits) {
        this(Missions.class, metadata, inits);
    }

    public QMissions(Class<? extends Missions> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.missionImg = inits.isInitialized("missionImg") ? new QMissionImg(forProperty("missionImg")) : null;
        this.stores = inits.isInitialized("stores") ? new QStores(forProperty("stores"), inits.get("stores")) : null;
    }

}

