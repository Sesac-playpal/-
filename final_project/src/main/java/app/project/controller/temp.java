package app.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class temp {

  @GetMapping("/")
  public String home() {
    return "home";
  }
}