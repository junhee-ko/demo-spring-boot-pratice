package me.jko.testtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.jko.testtest.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
