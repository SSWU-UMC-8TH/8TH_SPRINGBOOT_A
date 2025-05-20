package umc.spring.study.repository.RegionRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.study.domain.mapping.Regions;

public interface RegionRepository extends JpaRepository<Regions, Long>, RegionRepositoryCustom {
}
