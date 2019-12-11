package cloud.frizio.dev.demospringboot.demospringboot.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FunRestController {

  // Expose "/" that return Hello World
  @GetMapping("/")
  public String sayHello() {
    return "Hello dear user. Time on server is " + LocalDateTime.now();
  }

  // Expose "/workout" that return a message
  @GetMapping("/workout")
  public String getDailyWorkout() {
    return "Run a hard 5k";
  }

  // Expose "/" that return Hello World
  @GetMapping("/fortune")
  public String getDailyFortune() {
    return "Today is your lucky day";
  }

}