package lk.ijse.gdse63.demo1.config;

import lk.ijse.gdse63.demo1.WebAppInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = WebAppInitializer.class)
public class WebRootConfig {
    public WebRootConfig() {
        System.out.println(" Hello MVC");
    }
}
