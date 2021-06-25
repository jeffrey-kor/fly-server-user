package com.alliswell.flyserveruser.application.service;

import com.alliswell.flyserveruser.domain.entity.User;
import com.alliswell.flyserveruser.presentation.dto.UserDeleteDto;
import org.springframework.stereotype.Service;

@Service
public class UserCommandDeleteService {

  public User delete(UserDeleteDto userDeleteDto) {
    return new User();
  }
}
