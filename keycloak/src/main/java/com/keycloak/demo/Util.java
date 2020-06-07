package com.keycloak.demo;

import java.util.Arrays;
import java.util.List;

public class Util {

  public static List<String> getUsers() {
    return Arrays.asList("User 1", "User 2", "User 3");
  }

  public static List<String> getAdminUsers() {
    return Arrays.asList("Admin 1", "Admin 2");
  }
}
