package com.alliswell.flyserveruser.presentation.dto;

import lombok.Getter;

import java.util.UUID;

@Getter
public class UserSearchDto {
  private UUID id;
  private String username;
  private String password;
  private String email;
  private String address;

}
