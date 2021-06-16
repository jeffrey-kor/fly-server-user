package com.alliswell.flyserveruser.domain.entity;

import com.alliswell.flyserveruser.domain.vo.RoleVo;
import com.alliswell.flyserveruser.domain.vo.UserInfoVo;
import com.alliswell.flyserveruser.domain.vo.UserPasswordVo;
import com.alliswell.flyserveruser.domain.vo.UserUuidVo;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="user")
@NoArgsConstructor
@Getter
@Builder
public class User {

  @EmbeddedId
  private UserUuidVo uuid;

  @Column(length=50, nullable=false)
  private String username;

  @Column(length=50, nullable=false)
  private String nickname;

  @Embedded
  private UserPasswordVo password;

  @Column(length=100, nullable=false)
  private String address;

  @Column(length=100, nullable=false)
  private String email;

  @Temporal(TemporalType.TIMESTAMP)
  private Date created_at;

  @Temporal(TemporalType.TIMESTAMP)
  private Date updated_at;

  @Enumerated(EnumType.STRING)
  private RoleVo roleVo;

  @Builder
  public User(UserUuidVo uuid, String username, String nickname, UserPasswordVo password, String address, String email, Date created_at, Date updated_at, RoleVo roleVo) {
    this.uuid = uuid;
    this.username = username;
    this.nickname = nickname;
    this.password = password;
    this.address = address;
    this.email = email;
    this.created_at = created_at;
    this.updated_at = updated_at;
    this.roleVo = roleVo;
  }

  public void register() {}

  public void login() {}

  public void logout() {}

  public void authentication() {}

  public void validate() {}

  public void setEncryptPassword() {}

  public void changePassword() {}

  public void changeEmail() {}

  public void changeNickName() {}

}
