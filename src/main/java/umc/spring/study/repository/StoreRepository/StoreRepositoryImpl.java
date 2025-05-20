package umc.spring.study.repository.StoreRepository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import umc.spring.study.domain.mapping.Stores;
import umc.spring.study.domain.mapping.QStores;

import java.math.BigDecimal;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class StoreRepositoryImpl implements StoreRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;
    private final QStores stores = QStores.stores;

    @Override
    public List<Stores> dynamicQueryWithBooleanBuilder(String name, BigDecimal score) {
        BooleanBuilder predicate = new BooleanBuilder();

        if (name != null) {
            predicate.and(stores.name.eq(name));
        }

        if (score != null) {
            predicate.and(stores.score.goe(4.0f));
        }

        return jpaQueryFactory
                .selectFrom(stores)
                .where(predicate)
                .fetch();
    }
}