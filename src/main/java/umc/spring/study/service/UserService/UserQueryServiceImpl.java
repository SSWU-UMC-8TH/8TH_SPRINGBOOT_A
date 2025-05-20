package umc.spring.study.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.study.domain.enums.MissionStatus;
import umc.spring.study.domain.mapping.Stores;
import umc.spring.study.domain.mapping.Users;
import umc.spring.study.repository.StoreRepository.StoreRepository;
import umc.spring.study.repository.UserRepository.UserRepository;
import umc.spring.study.web.dto.MyPageResponse;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserQueryServiceImpl implements UserQueryService {

    private final UserRepository userRepository;

    @Override
    public MyPageResponse getMyPage(Long userId) {
        Users user = userRepository.findUserWithDetails(userId)
                .orElseThrow(() -> new NoSuchElementException("User not found"));

        long ongoing = user.getUserMissionList().stream()
                .filter(um -> um.getMissionStatus() == MissionStatus.ongoing)
                .count();

        long completed = user.getUserMissionList().stream()
                .filter(um -> um.getMissionStatus() == MissionStatus.completed)
                .count();

        return MyPageResponse.builder()
                .nickname(user.getNickname())
                .email(user.getEmail())
                .point(user.getPoint())
                .userStatus(user.getUserStatus())
                .ongoingMissionsCount(ongoing)
                .completedMissionsCount(completed)
                .totalReviewsCount(user.getReviewsList().size())
                .build();
    }

}
