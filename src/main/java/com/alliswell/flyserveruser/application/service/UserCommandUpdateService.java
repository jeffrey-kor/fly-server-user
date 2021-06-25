package com.alliswell.flyserveruser.application.service;

import com.alliswell.flyserveruser.domain.entity.User;
import com.alliswell.flyserveruser.presentation.dto.UserUpdateDto;
import org.springframework.stereotype.Service;

@Service
public class UserCommandUpdateService {
  public User update(UserUpdateDto userUpdateDto) {
    return new User();
  }
}
