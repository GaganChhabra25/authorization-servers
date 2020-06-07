package com.aaa.rampup.demo.services.impl;

import com.aaa.rampup.demo.model.User;
import com.aaa.rampup.demo.repository.UserRepository;
import com.aaa.rampup.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserRepository userRepository;

  @Override
  public List<User> getUsers() {
    return userRepository.findAll();
  }

  @Override
  @Transactional
  public void create(User user)  {
      userRepository.save(user);
  }

  @Override
  public void delete(Integer Id) {
    userRepository.deleteById(Id);
  }

  @Override
  public User update(User user) {
    Optional<User> optionalUser = userRepository.findById(user.getId());
    if(optionalUser.isPresent()) {
      User existingUser = optionalUser.get();
      existingUser.setFirstName(user.getFirstName());
      existingUser.setLastName(user.getLastName());
      return userRepository.saveAndFlush(existingUser);
    } else {
      throw new RuntimeException("User not found with Id "+ user.getId());
    }
  }

  @Override
  public User getById(Integer Id) {
    return userRepository.getOne(Id);
  }
}
