package lesson42.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerHello {

    @GetMapping("/")
    public String showForm() {
        return "form";
    }

    @PostMapping("/greet")
    public String greet(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}