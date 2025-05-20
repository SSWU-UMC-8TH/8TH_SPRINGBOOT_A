package umc.spring.study.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.study.domain.common.BaseEntity;
import umc.spring.study.domain.enums.MissionStatus;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor

public class UserMission extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userMissionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id")
    private Missions missions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Stores stores;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_img_id")
    private MissionImg missionImg;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(10)")
    private MissionStatus missionStatus;

    @Override
    public String toString() {
        return "UserMission{" +
                "userMissionId=" + userMissionId +
                ", users=" + (users != null ? users.getName() : "N/A") +
                ", missions=" + (missions != null ? missions.getContent() : "N/A") +
                ", stores=" + (stores != null ? stores.getName() : "N/A") +
                ", missionImg=" + (missionImg != null ? missionImg.getMissionImgUrl() : "N/A") +
                ", missionStatus=" + missionStatus +
                '}';
    }

}