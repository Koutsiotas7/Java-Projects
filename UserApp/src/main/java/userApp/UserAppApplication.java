package userApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@ComponentScan(basePackages = {"MainPageController", "entities", "repositories", "controllers"})
@EnableJpaRepositories(basePackages = "repositories")
@EntityScan(basePackages = "entities") 
public class UserAppApplication 
{
    public static void main(String[] args) 
    {
        SpringApplication.run(UserAppApplication.class, args);
    }
}
