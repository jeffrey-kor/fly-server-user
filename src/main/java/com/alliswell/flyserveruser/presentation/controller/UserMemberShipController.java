package com.alliswell.flyserveruser.presentation.controller;

import com.alliswell.flyserveruser.application.service.UserCommandDeleteService;
import com.alliswell.flyserveruser.application.service.UserCommandUpdateService;
import com.alliswell.flyserveruser.application.service.UserQuerySearchService;
import com.alliswell.flyserveruser.application.service.UserCommandRegisterService;
import com.alliswell.flyserveruser.domain.entity.User;
import com.alliswell.flyserveruser.infrastructure.repository.query.UserQueryRepositoryMapper;
import com.alliswell.flyserveruser.presentation.dto.UserDeleteDto;
import com.alliswell.flyserveruser.presentation.dto.UserRegisterDto;
import com.alliswell.flyserveruser.presentation.dto.UserSearchDto;
import com.alliswell.flyserveruser.presentation.dto.UserUpdateDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags={"1. User Register"})
@RequiredArgsConstructor
@RestController
@RequestMapping(value="/user/v1")
public class UserMemberShipController {

  private UserCommandRegisterService userCommandRegisterService;
  private UserCommandUpdateService userCommandUpdateService;
  private UserCommandDeleteService userCommandDeleteService;
  private UserQuerySearchService userQuerySearchService;

  @ApiOperation(value="Find Member", notes="Find all member registered")
  @GetMapping(value="/findAll")
  public List<User> findAllUser(UserSearchDto userSearchDto) {
    return userQuerySearchService.findAll(userSearchDto);
  }

  @ApiOperation(value="Register Member", notes="Register member within encrypted password")
  @PostMapping(value="/register")
  public void register(UserRegisterDto userRegisterDto) {
    userCommandRegisterService.save(userRegisterDto);
  }

  @ApiOperation(value="Update Member Information", notes="Update member information")
  @PatchMapping("/update")
  public User update(UserUpdateDto userUpdateDto) {
    return userCommandUpdateService.update(userUpdateDto);
  }

  @ApiOperation(value="Delete Member", notes="Delete member")
  @DeleteMapping("/delete")
  public User delete(UserDeleteDto userDeleteDto) {
    return userCommandDeleteService.delete(userDeleteDto);
  }



}
