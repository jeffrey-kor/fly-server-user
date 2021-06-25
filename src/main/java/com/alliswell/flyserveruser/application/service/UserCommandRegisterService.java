package com.alliswell.flyserveruser.application.service;

import com.alliswell.flyserveruser.domain.entity.User;
import com.alliswell.flyserveruser.presentation.dto.UserRegisterDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service()
public class UserCommandRegisterService implements UserDetailsService {

  private User user;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    return null;
  }

  public void save(UserRegisterDto userRegisterDto) {}
}
