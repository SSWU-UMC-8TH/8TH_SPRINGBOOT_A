package umc.spring.study.domain.mapping;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStores is a Querydsl query type for Stores
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStores extends EntityPathBase<Stores> {

    private static final long serialVersionUID = 1195595929L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStores stores = new QStores("stores");

    public final umc.spring.study.domain.common.QBaseEntity _super = new umc.spring.study.domain.common.QBaseEntity(this);

    public final StringPath address = createString("address");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath name = createString("name");

    public final QRegions regions;

    public final NumberPath<java.math.BigDecimal> score = createNumber("score", java.math.BigDecimal.class);

    public final NumberPath<Long> storeId = createNumber("storeId", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QStores(String variable) {
        this(Stores.class, forVariable(variable), INITS);
    }

    public QStores(Path<? extends Stores> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStores(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStores(PathMetadata metadata, PathInits inits) {
        this(Stores.class, metadata, inits);
    }

    public QStores(Class<? extends Stores> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.regions = inits.isInitialized("regions") ? new QRegions(forProperty("regions")) : null;
    }

}

