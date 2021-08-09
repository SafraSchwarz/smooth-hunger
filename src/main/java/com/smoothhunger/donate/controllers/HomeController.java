package com.smoothhunger.donate.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  @GetMapping(value = {"/landing-page"})
  public String forward() {
    return "forward:/";
  }
}
