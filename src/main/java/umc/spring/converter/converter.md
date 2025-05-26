# converter 패키지

converter는 데이터 형식 간의 변환을 수행하는 역할입니다.  
그렇다면 entity to dto를 해야 한다는 것인데, 이것은 어디서 할까요?

**repository에서 받아온 엔티티를 dto로 바꾸는 과정**을 converter에서 하게 됩니다.

**추가로 entity의 생성 역시** converter에서 수행하기도 합니다.

converter에서 entity의 생성을 하지 않고 service에서 하도록 하는 경우도 있습니다.

converter에서 엔티티의 생성을 하게 되면, service는 순수하게 비즈니스 로직에만 집중할 수 있어 단일 책임 원칙 측면에서 더 좋습니다.