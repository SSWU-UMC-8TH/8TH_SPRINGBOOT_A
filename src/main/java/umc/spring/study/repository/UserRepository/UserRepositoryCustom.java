package umc.spring.study.repository.UserRepository;

import umc.spring.study.domain.mapping.Users;

import java.util.Optional;

public interface UserRepositoryCustom {
    Optional<Users> findUserWithDetails(Long userId); // 사용자 정보 + 연관 데이터
}