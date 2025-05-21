package umc.spring.study.service.ReviewService;

import umc.spring.study.domain.mapping.Reviews;
import umc.spring.study.domain.mapping.Stores;
import umc.spring.study.web.dto.ReviewCreateRequest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface ReviewQueryService {
    Reviews createReview(ReviewCreateRequest request);
}
