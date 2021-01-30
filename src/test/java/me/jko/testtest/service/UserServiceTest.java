package me.jko.testtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import me.jko.testtest.entity.User;
import me.jko.testtest.repository.UserRepository;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.given;

@SpringBootTest
class UserServiceTest {

  @MockBean
  private UserRepository userRepository;

  @Autowired
  private UserService userService;

  @Test
  void aa() {

    // Given
    User user01 = new User();
    User user02 = new User();
    User user03 = new User();

    List<User> users = Arrays.asList(user01, user02, user03);
    given(userRepository.findAll()).willReturn(users);

    // When
    userService.getUsers();

    // Then
  }

}