package com.github.fgmachado.javadockersample.resource;

import com.github.fgmachado.javadockersample.resource.response.DummyResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dummy")
public class DummyController {

  @GetMapping
  public DummyResponse hello() {
    return DummyResponse.builder().message("Hello from Dummy!").build();
  }

}
