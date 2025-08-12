package MainPageController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPageController 
{
    @GetMapping("/")
    public String hello() 
    {
        return "Hello from our app!";
    }
}
