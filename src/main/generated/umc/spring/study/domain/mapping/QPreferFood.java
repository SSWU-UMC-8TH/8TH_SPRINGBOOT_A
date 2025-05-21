package umc.spring.study.domain.mapping;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPreferFood is a Querydsl query type for PreferFood
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPreferFood extends EntityPathBase<PreferFood> {

    private static final long serialVersionUID = 1062933493L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPreferFood preferFood = new QPreferFood("preferFood");

    public final umc.spring.study.domain.common.QBaseEntity _super = new umc.spring.study.domain.common.QBaseEntity(this);

    public final QFoodCategory category;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> preferFoodId = createNumber("preferFoodId", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final QUsers users;

    public QPreferFood(String variable) {
        this(PreferFood.class, forVariable(variable), INITS);
    }

    public QPreferFood(Path<? extends PreferFood> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPreferFood(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPreferFood(PathMetadata metadata, PathInits inits) {
        this(PreferFood.class, metadata, inits);
    }

    public QPreferFood(Class<? extends PreferFood> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.category = inits.isInitialized("category") ? new QFoodCategory(forProperty("category")) : null;
        this.users = inits.isInitialized("users") ? new QUsers(forProperty("users")) : null;
    }

}

