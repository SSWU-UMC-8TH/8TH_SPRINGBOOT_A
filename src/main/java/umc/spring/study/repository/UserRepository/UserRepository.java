package umc.spring.study.repository.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.study.domain.mapping.Users;

public interface UserRepository extends JpaRepository<Users, Long>, UserRepositoryCustom {
}
