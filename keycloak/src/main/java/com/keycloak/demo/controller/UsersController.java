package com.keycloak.demo.controller;

import com.keycloak.demo.Util;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
public class UsersController {

  @GetMapping("/users")
  public List<String> users() {
    return Util.getUsers();
  }

  @GetMapping("/admin/users")
  public List<String> adminUsers(Principal principal) {
    System.out.println("======" + principal);
    return Util.getAdminUsers();
  }
}
