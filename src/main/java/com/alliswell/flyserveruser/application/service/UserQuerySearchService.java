package com.alliswell.flyserveruser.application.service;

import com.alliswell.flyserveruser.domain.entity.User;
import com.alliswell.flyserveruser.presentation.dto.UserSearchDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserQuerySearchService {

  public List<User> findAll(UserSearchDto userSearchDto) {
    return new ArrayList<User>();
  }
}
