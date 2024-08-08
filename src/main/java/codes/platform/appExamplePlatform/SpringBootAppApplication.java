package codes.platform.appExamplePlatform;


import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootAppApplication {
  private final Logger logger = LoggerFactory.getLogger(SpringBootAppApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(SpringBootAppApplication.class, args);
  }

  @RestController
  @RequestMapping("/info")
  class K8sController {

    @GetMapping
    public ResponseEntity<String> get() {
      logger.info(String.format("Hello from K8S Application at %s", LocalDateTime.now()));
      return ResponseEntity.ok("Hello from K8S Application");
    }
  }

}
