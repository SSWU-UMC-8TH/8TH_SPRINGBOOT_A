package umc.spring.study.repository.StoreRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.study.domain.mapping.Stores;

public interface StoreRepository extends JpaRepository<Stores, Long>, StoreRepositoryCustom {
}
