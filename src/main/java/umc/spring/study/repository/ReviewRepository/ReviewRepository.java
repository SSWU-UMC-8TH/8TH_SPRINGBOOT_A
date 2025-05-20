package umc.spring.study.repository.ReviewRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.study.domain.mapping.Reviews;

public interface ReviewRepository extends JpaRepository<Reviews, Long>, ReviewRepositoryCustom {
}
