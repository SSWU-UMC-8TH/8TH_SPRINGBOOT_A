package umc.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import umc.spring.study.domain.enums.Gender;
import umc.spring.study.domain.enums.MissionStatus;
import umc.spring.study.domain.enums.UserStatus;
import umc.spring.study.domain.mapping.*;
import umc.spring.study.service.RegionService.RegionQueryService;
import umc.spring.study.service.StoreService.StoreQueryService;

import java.math.BigDecimal;

@SpringBootApplication
@EnableJpaAuditing
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner run(ApplicationContext context) {
		return args -> {
			StoreQueryService storeService = context.getBean(StoreQueryService.class);
			RegionQueryService regionService = context.getBean(RegionQueryService.class);

			// Store 테스트 코드
			String name = "가게1";
			BigDecimal score = BigDecimal.valueOf(4.0f);

			System.out.println("===== Store 테스트 =====");
			System.out.println("Name: " + name);
			System.out.println("Score: " + score);

			storeService.findStoresByNameAndScore(name, score)
					.forEach(System.out::println);

			// Users 테스트 코드
			var user_ = Users.builder()
					.userId(1L)
					.name("김이안")
					.nickname("얀")
					.gender(Gender.FEMALE)
					.age(23)
					.address("성남시 분당구")
					.email("iann030327@naver.com")
					.phoneNumber("01036946460")
					.point(1000)
					.userStatus(UserStatus.active)
					.build();

			System.out.println("===== Users 테스트 =====");
			System.out.println(user_);

			// UserMission 테스트 코드
			var user = Users.builder()
					.userId(1L)
					.name("김이안")
					.build();

			var mission = Missions.builder()
					.missionId(1L)
					.content("2000원 이상의 식사를 하세요")
					.build();

			var store = Stores.builder()
					.storeId(1L)
					.name("가게1")
					.build();

			var missionImg = MissionImg.builder()
					.missionImgId(1L)
					.missionImgUrl("img.jpg")
					.build();

			var userMission = UserMission.builder()
					.userMissionId(1L)
					.users(user)
					.missions(mission)
					.stores(store)
					.missionImg(missionImg)
					.missionStatus(MissionStatus.ongoing)
					.build();

			System.out.println("===== UserMission 테스트 =====");
			System.out.println(userMission);

			// Reviews 테스트 코드
			var reviewImg = ReviewImg.builder()
					.reviewImgId(1L)
					.reviewImgUrl("img.jpg")
					.build();

			var review = Reviews.builder()
					.reviewId(1L)
					.users(user)
					.stores(store)
					.reviewImg(reviewImg)
					.content("정말 맛있어요!")
					.score(5)
					.build();

			System.out.println("===== Reviews 테스트 =====");
			System.out.println(review);

			// ===== Regions 홈 화면 쿼리 테스트  =====
			System.out.println("===== Regions 홈 화면 쿼리 테스트 =====");

			// 1. 지역 생성
			var region = Regions.builder()
					.regionId(1L)
					.name("성남시 분당구")
					.build();

			// 2. 가게 생성 (지역 연결)
			var regionStore = Stores.builder()
					.storeId(2L)
					.name("가게33")
					.regions(region)
					.build();

			// 4. 쿼리 실행 (페이징 적용)
			System.out.println("지역 ID 1번의 미션 조회 결과:");		// 앞에서 명시적으로 regionId 1L로 설정함
			regionService.getAvailableMissions(1L, PageRequest.of(0, 10))
					.forEach(m -> System.out.println("• " + m.getContent()));
		};
	}
}