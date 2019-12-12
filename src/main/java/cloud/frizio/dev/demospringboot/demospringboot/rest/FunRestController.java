package cloud.frizio.dev.demospringboot.demospringboot.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FunRestController {

  @Value("${info.app.version}")
  private String version;

  @Value("${coach.name}")
  private String coachName;

  @Value("${coach.team}")
  private String coachTeam;

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

  // Expose "/version"
  @GetMapping("/version")
  public String getVersion() {
    return "From the Maven POM, the version is: " + this.version;
  }

  // Expose "/teaminfo"
  @GetMapping("/teaminfo")
  public String getTeamInfo() {
    return "Coach name: " + this.coachName + "Team: " + this.coachTeam;
  }

}