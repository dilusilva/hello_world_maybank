package com.example.maybank.assignment.hello_world;

import com.example.maybank.assignment.hello_world.model.Messages;
import com.example.maybank.assignment.hello_world.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class HelloWorldApplication implements CommandLineRunner {

  private final MessageRepository messageRepository;

  public static void main(String[] args) {
    SpringApplication.run(HelloWorldApplication.class, args);
  }

  /**
   * Adding test data on application startup time - New table and data will be creating every start
   * time because of 'spring.jpa.hibernate.ddl-auto=create' config
   *
   * @param args incoming main method arguments
   * @throws Exception
   */
  @Override
  public void run(String... args) throws Exception {
    Messages message = Messages.builder().message("Hello World").build();
    messageRepository.save(message);
  }
}
