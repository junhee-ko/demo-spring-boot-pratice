package me.jko.testtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import me.jko.testtest.entity.User;
import me.jko.testtest.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @PostMapping
  public void saveUser(@RequestBody ReuqestDTO reuqestDTO) {
    System.out.println("-------------");
    userService.save(reuqestDTO);
  }

  @GetMapping("/users")
  public List<User> getUsers() {
    return userService.getUsers();
  }

  @PutMapping
  public User updateUser(UpdateDTO updateDTO) {
    return userService.updateBy(updateDTO);
  }
}
