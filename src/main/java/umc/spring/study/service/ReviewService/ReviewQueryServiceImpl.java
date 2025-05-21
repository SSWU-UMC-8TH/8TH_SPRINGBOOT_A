package umc.spring.study.service.ReviewService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.study.domain.mapping.Reviews;
import umc.spring.study.domain.mapping.Stores;
import umc.spring.study.domain.mapping.Users;
import umc.spring.study.repository.ReviewRepository.ReviewRepository;
import umc.spring.study.repository.StoreRepository.StoreRepository;
import umc.spring.study.repository.UserRepository.UserRepository;
import umc.spring.study.web.dto.ReviewCreateRequest;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ReviewQueryServiceImpl implements ReviewQueryService {
    private final ReviewRepository reviewRepository;
    private final StoreRepository storeRepository;
    private final UserRepository userRepository;

    @Override
    @Transactional
    public Reviews createReview(ReviewCreateRequest request) {
        Users users = userRepository.findById(request.getUserId())
                .orElseThrow(() -> new IllegalArgumentException("사용자를 찾을 수 없습니다."));
        Stores stores = storeRepository.findById(request.getStoreId())
                .orElseThrow(() -> new IllegalArgumentException("가게를 찾을 수 없습니다."));


        Reviews reviews = Reviews.builder()
                .users(users)
                .stores(stores)
                .content(request.getContent())
                .score(request.getScore())
                .build();

        return reviewRepository.save(reviews);
    }
}
