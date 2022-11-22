package itjockebark.personaltrainer.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class HomePageController {

    @GetMapping("")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("login")
    public String login() {
        return "login";
    }

        @GetMapping("dashboard")
   // @PreAuthorize("hasAuthority('permission:all')")
    public String showDashboardPage() {
        return "dashboard";
    }

    @GetMapping("hej")
   // @PreAuthorize("hasAnyRole('ADMIN')")
    public String showHejPage() {
        return "hej";
    }


}

