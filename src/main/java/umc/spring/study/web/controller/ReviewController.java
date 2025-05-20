package umc.spring.study.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import umc.spring.study.domain.mapping.Reviews;
import umc.spring.study.service.ReviewService.ReviewQueryService;
import umc.spring.study.web.dto.ReviewCreateRequest;

@Controller
@RequestMapping("/api/reviews")
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewQueryService reviewQueryService;

    @PostMapping
    public ResponseEntity<Reviews>
    createReview(@RequestBody ReviewCreateRequest request) {
        Reviews reviews = reviewQueryService.createReview(request);
        return ResponseEntity.ok(reviews);
    }
}