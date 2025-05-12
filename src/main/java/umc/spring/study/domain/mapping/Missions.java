package umc.spring.study.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.study.domain.common.BaseEntity;

import java.time.LocalDate;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor

public class Missions extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long missionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Stores stores;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_img_id")
    private MissionImg missionImg;

    @Column(nullable = false, columnDefinition = "int DEFAULT 0")
    private int point;

    private LocalDate deadline;

    @Column(nullable = false, length = 1024)
    private String content;
}