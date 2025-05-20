package umc.spring.study.domain.mapping;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMissionImg is a Querydsl query type for MissionImg
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMissionImg extends EntityPathBase<MissionImg> {

    private static final long serialVersionUID = -1865217026L;

    public static final QMissionImg missionImg = new QMissionImg("missionImg");

    public final umc.spring.study.domain.common.QBaseEntity _super = new umc.spring.study.domain.common.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> missionImgId = createNumber("missionImgId", Long.class);

    public final StringPath missionImgUrl = createString("missionImgUrl");

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMissionImg(String variable) {
        super(MissionImg.class, forVariable(variable));
    }

    public QMissionImg(Path<? extends MissionImg> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMissionImg(PathMetadata metadata) {
        super(MissionImg.class, metadata);
    }

}

