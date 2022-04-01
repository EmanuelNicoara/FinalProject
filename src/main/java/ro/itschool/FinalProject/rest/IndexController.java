package ro.itschool.FinalProject.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Value("${msg.title}")
    private String title;

    @GetMapping (value =  "/")
    public String index(Model model){
     System.out.println(this.title);
        model.addAttribute("title", title);
       return "index";

    }

}



