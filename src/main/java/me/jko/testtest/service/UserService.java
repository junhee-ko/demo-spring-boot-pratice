package me.jko.testtest.service;

import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import me.jko.testtest.controller.ReuqestDTO;
import me.jko.testtest.controller.UpdateDTO;
import me.jko.testtest.entity.User;
import me.jko.testtest.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public void save(ReuqestDTO reuqestDTO) {
    User user = new User();
    user.setName(reuqestDTO.getName());

    userRepository.save(user);
  }

  public List<User> getUsers() {
    return userRepository.findAll();
  }

  @Transactional
  public User updateBy(UpdateDTO updateDTO) {
    User user = userRepository.findById(updateDTO.getId()).orElseThrow(EntityNotFoundException::new);
    user.setName(updateDTO.getName());

    return user;
  }
}