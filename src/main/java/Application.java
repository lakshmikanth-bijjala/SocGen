import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@ComponentScan(basePackages = {"default"})
@EnableScheduling
@EnableCaching
public class Application implements WebMvcConfigurer {

  public static void main(final String[] args) {
    SpringApplication.run(Application.class, args);
  }
 }
