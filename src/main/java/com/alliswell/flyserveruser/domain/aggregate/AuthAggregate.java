package com.alliswell.flyserveruser.domain.aggregate;

public class AuthAggregate {
  // 애그리거트는 관련 도메인을 하나의 군집으로 묶은 것
  /*
  * 애그리거트에 속한 객체가 일관된 상태를 유지하려면 애그리거트 전체를 관리할 주체가 필요하다.

루트 엔티티는 애그리거트의 대표 엔티티로, 애그리거트에 속한 엔티티는 루트 엔티티에 직접 혹은 간접적으로 속한다.

애그리거트 루트의 핵심 역할은 애그리거트의 일관성이 깨지지 않도록 조율하는 것이다.
애그리거트 루트는 애그리거트가 제공해야 할 도메인 기능을 제공한다.
주문 애그리거트의 루트 엔티티 Order는 관련 기능을 구현한 메소드를 제공
배송지 변경
상품 변경 등.


출처: https://private-space.tistory.com/94 [티끌모아 산을 쌓아보자]
  * */
  /*
  *
  * */
  public void authentication() {}

  public void authorization() {}

}
