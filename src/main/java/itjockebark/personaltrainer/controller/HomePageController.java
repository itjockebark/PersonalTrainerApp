package itjockebark.personaltrainer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomePageController {

    @GetMapping("")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("login")
    public String getLoginView() {
        return "login";
    }

    @GetMapping("dashboard")
    public String showDashboardPage() {
        return "dashboard";
    }
}
//Login och registration rests
