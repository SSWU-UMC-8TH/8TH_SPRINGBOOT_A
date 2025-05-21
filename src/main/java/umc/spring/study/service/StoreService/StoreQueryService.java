package umc.spring.study.service.StoreService;

import umc.spring.study.domain.mapping.Stores;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface StoreQueryService {
    Optional<Stores> findStore(Long storeId); // 매개변수명 id → storeId로 명시적 변경
    List<Stores> findStoresByNameAndScore(String name, BigDecimal score); // Float → BigDecimal 수정
}

