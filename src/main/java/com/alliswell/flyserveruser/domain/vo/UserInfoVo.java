package com.alliswell.flyserveruser.domain.vo;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
public class UserInfoVo {

  @Column(length=50, nullable=false)
  private String username;

  @Column(length=50, nullable=false)
  private String nickname;

  @Column(length=100, nullable=false)
  private String address;

  @Column(length=100, nullable=false)
  private String email;

  public UserInfoVo(String username, String nickname, String address, String email) {
    this.username = username;
    this.nickname = nickname;
    this.address = address;
    this.email = email;
  }

}
