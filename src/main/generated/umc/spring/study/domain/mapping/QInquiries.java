package umc.spring.study.domain.mapping;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInquiries is a Querydsl query type for Inquiries
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInquiries extends EntityPathBase<Inquiries> {

    private static final long serialVersionUID = 726946398L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInquiries inquiries = new QInquiries("inquiries");

    public final umc.spring.study.domain.common.QBaseEntity _super = new umc.spring.study.domain.common.QBaseEntity(this);

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> inquiryId = createNumber("inquiryId", Long.class);

    public final QInquiryImg inquiryImg;

    public final StringPath title = createString("title");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final QUsers users;

    public QInquiries(String variable) {
        this(Inquiries.class, forVariable(variable), INITS);
    }

    public QInquiries(Path<? extends Inquiries> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInquiries(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInquiries(PathMetadata metadata, PathInits inits) {
        this(Inquiries.class, metadata, inits);
    }

    public QInquiries(Class<? extends Inquiries> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.inquiryImg = inits.isInitialized("inquiryImg") ? new QInquiryImg(forProperty("inquiryImg")) : null;
        this.users = inits.isInitialized("users") ? new QUsers(forProperty("users")) : null;
    }

}

