package org.svgroz.imtiredoftech.controller;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostController {

  @GetMapping("foo")
  public Map<String, String> foo() {
    return Map.of("foo", OffsetDateTime.now().toString());
  }
}
