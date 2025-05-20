package umc.spring.study.repository.MissionRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.study.domain.mapping.UserMission;

public interface MissionRepository extends JpaRepository<UserMission, Long>, MissionRepositoryCustom {
}
