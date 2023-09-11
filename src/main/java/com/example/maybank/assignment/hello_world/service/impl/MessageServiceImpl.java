package com.example.maybank.assignment.hello_world.service.impl;

import com.example.maybank.assignment.hello_world.model.Messages;
import com.example.maybank.assignment.hello_world.repository.MessageRepository;
import com.example.maybank.assignment.hello_world.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

  private final MessageRepository messageRepository;

  /**
   * Get first message from messages table
   *
   * @return {@link String} message
   */
  @Override
  public String getMessage() {
    Messages message = messageRepository.findFirstByOrderById();
    return Objects.nonNull(message) ? message.getMessage() : null;
  }
}
