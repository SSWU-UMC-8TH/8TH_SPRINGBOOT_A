package umc.spring.study.repository.StoreRepository;

import umc.spring.study.domain.mapping.Stores;

import java.math.BigDecimal;
import java.util.List;

public interface StoreRepositoryCustom {
    List<Stores> dynamicQueryWithBooleanBuilder(String name, BigDecimal score);
}