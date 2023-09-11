package com.example.maybank.assignment.hello_world.controller;

import com.example.maybank.assignment.hello_world.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class HelloWorldController {

  private final MessageService messageService;

  /**
   * Default controller method for get home page
   *
   * @param model
   * @return template name
   */
  @GetMapping("/")
  public String hello(final Model model) {
    final String message = messageService.getMessage();
    model.addAttribute("message", message);
    return "hello";
  }
}
