package com.spring.project.springProject.repositories;

import com.spring.project.springProject.entities.Order;
import com.spring.project.springProject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {


}
