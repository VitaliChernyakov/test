package config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping ({"/app"})
    public  String handle(Model model){
        model.addAttribute("message", "Hello world!");
        return "index";
    }
}
