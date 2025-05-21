package umc.spring.study.domain.mapping;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRegions is a Querydsl query type for Regions
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRegions extends EntityPathBase<Regions> {

    private static final long serialVersionUID = 1379147768L;

    public static final QRegions regions = new QRegions("regions");

    public final umc.spring.study.domain.common.QBaseEntity _super = new umc.spring.study.domain.common.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath name = createString("name");

    public final NumberPath<Long> regionId = createNumber("regionId", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QRegions(String variable) {
        super(Regions.class, forVariable(variable));
    }

    public QRegions(Path<? extends Regions> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRegions(PathMetadata metadata) {
        super(Regions.class, metadata);
    }

}

