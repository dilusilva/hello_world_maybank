package com.example.maybank.assignment.hello_world.repository;

import com.example.maybank.assignment.hello_world.model.Messages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Messages, Long> {

  Messages findFirstByOrderById();
}
