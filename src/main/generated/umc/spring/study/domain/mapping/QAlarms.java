package umc.spring.study.domain.mapping;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAlarms is a Querydsl query type for Alarms
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAlarms extends EntityPathBase<Alarms> {

    private static final long serialVersionUID = 672466217L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAlarms alarms = new QAlarms("alarms");

    public final umc.spring.study.domain.common.QBaseEntity _super = new umc.spring.study.domain.common.QBaseEntity(this);

    public final NumberPath<Long> alarmId = createNumber("alarmId", Long.class);

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final EnumPath<umc.spring.study.domain.enums.Dtype> dtype = createEnum("dtype", umc.spring.study.domain.enums.Dtype.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final QUsers users;

    public QAlarms(String variable) {
        this(Alarms.class, forVariable(variable), INITS);
    }

    public QAlarms(Path<? extends Alarms> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAlarms(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAlarms(PathMetadata metadata, PathInits inits) {
        this(Alarms.class, metadata, inits);
    }

    public QAlarms(Class<? extends Alarms> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.users = inits.isInitialized("users") ? new QUsers(forProperty("users")) : null;
    }

}

