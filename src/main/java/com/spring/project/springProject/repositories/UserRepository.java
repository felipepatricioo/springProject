package com.spring.project.springProject.repositories;

import com.spring.project.springProject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<User, Long> {


}
