package com.alliswell.flyserveruser.domain.vo;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
public class UserPasswordVo {

  @Column(name="password")
  private String password;

  public UserPasswordVo(String password) {
    this.password = password;
  }

  public boolean match(String password) {
    return this.password.equals(password);
  }

}
