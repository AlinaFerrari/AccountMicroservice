package Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestController {


    private static final Logger log = LoggerFactory.getLogger(RestController.class);

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello everyone!";
    }
}