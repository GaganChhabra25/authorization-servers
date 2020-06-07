package com.aaa.rampup.demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class OktaController {

  @GetMapping
  public String echoTheUsersEmailAddress(@AuthenticationPrincipal OidcUser user) {
    return "Hey! Welcome  " + user.getFullName();
  }
}
