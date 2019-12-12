package cloud.frizio.dev.demospringboot.demospringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "coach")
public class CoachModuleProperties {

  private String name;
  private String team;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getTeam() {
    return team;
  }
  public void setTeam(String team) {
    this.team = team;
  }
  
}