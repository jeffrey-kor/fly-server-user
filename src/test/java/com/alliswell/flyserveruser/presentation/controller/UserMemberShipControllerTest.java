package com.alliswell.flyserveruser.presentation.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.filter.CharacterEncodingFilter;

@SpringBootTest
@AutoConfigureMockMvc
class UserMemberShipControllerTest {
  @Autowired private MockMvc mockMvc;
  @Autowired
  UserMemberShipController userMemberShipController;

  @BeforeEach
  public void beforeEach() {
    mockMvc = MockMvcBuilders.standaloneSetup(userMemberShipController)
      .addFilter(new CharacterEncodingFilter("utf-8", true))
      .alwaysExpect(MockMvcResultMatchers.status().isOk())
      .build();
  }

  @Test
  public void test() throws Exception {

    final MockHttpServletResponse response = mockMvc.perform(MockMvcRequestBuilders
      .get("/test")
      .contentType(MediaType.APPLICATION_JSON).content("Hello, Controller"))
      .andExpect(MockMvcResultMatchers.status().isOk())
      .andDo(MockMvcResultHandlers.print())
      .andReturn()
      .getResponse();

    Assertions.assertThat(response.getContentAsString()).isEqualTo("Hello, Controller");
  }

}