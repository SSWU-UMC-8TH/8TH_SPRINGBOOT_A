package umc.spring.study.service.UserService;

import umc.spring.study.web.dto.MyPageResponse;

public interface UserQueryService {
    MyPageResponse getMyPage(Long userId);
}