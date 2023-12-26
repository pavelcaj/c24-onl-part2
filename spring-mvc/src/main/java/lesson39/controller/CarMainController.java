package lesson39.controller;
import lesson39.model.CarInfo;
import lesson39.model.CarInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class CarMainController {

    @GetMapping("/car")
    public String mainPage(Model model) {
        model.addAttribute("carInfo", carInfoService.getCarInfo("Camaro SS"));
        return "carHello";
    }
@GetMapping("/ss")
public String pageSs(){
        return "ss";
}
@GetMapping("/z28")
    public String pageZ28(){
        return "z28";
}
@GetMapping("/z28_2010")
    public String pageZ28_2010(){
        return"z28_2010";
    }
    @Autowired
    private CarInfoService carInfoService;

    @GetMapping("/edit/{modelName}")
    public String editCarInfo(@PathVariable String modelName, Model model) {
        CarInfo carInfo = carInfoService.getCarInfo(modelName);
        model.addAttribute("carInfo", carInfo);

        // Возвращаем имя представления, соответствующее модели
        return "edit" + modelName; // Предполагается, что у вас есть, например, editcamaroSS.jsp
    }

    @PostMapping("/edit/{modelName}")
    public String processEditCarInfo(@PathVariable String modelName, @ModelAttribute CarInfo updatedCarInfo, Model model) {
        carInfoService.updateCarInfo(modelName, updatedCarInfo);
        model.addAttribute("carInfo", updatedCarInfo);
        return "redirect:/car";
    }
}
