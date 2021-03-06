package com.alliswell.flyserveruser.shared.config;

import com.alliswell.flyserveruser.application.service.UserCommandRegisterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

  private UserCommandRegisterService userCommandRegisterService;

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Override
  public void configure(WebSecurity web) throws Exception {
    web.ignoring().antMatchers("/css/**", "/js/**", "/img/**", "/lib/**");
  }

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(userCommandRegisterService).passwordEncoder(passwordEncoder());
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
      .csrf().disable()
      .authorizeRequests()
      .antMatchers("/user/**").authenticated()
      .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
      .antMatchers("/manager/**").access("hasRole('ROLE_MANAGER')")
      .anyRequest().permitAll();

    http.formLogin() // ??? ????????? ?????? ??????
      .loginPage("/login") // ???????????? ????????? ???????????? ????????? ?????? ?????? ??????
      .defaultSuccessUrl("/") // ????????? ?????? ????????? ???????????? ????????? URL
      .permitAll();

    http.logout()
      .logoutRequestMatcher(new AntPathRequestMatcher("/logout")) // ???????????? ?????? ??????
      .logoutSuccessUrl("/login") // ???????????? ????????? ????????? ?????? ??????
      .invalidateHttpSession(true); // ???????????? ????????? ?????? ??????

    http.exceptionHandling()
      .accessDeniedPage("/denied");
  }
}
