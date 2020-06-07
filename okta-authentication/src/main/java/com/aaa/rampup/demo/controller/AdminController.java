package com.aaa.rampup.demo.controller;

import com.okta.sdk.client.Client;
import com.okta.sdk.resource.user.UserList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/admin/okta/")
public class AdminController {

  @Autowired
  private Client client;

  @GetMapping("users")
  public UserList getUsers() {
    return client.listUsers();
  }
}
