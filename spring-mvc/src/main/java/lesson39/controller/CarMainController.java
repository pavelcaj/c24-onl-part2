package lesson39.controller;

import lesson39.exception.ValidationException;
import lesson39.model.CarInfo;
import lesson39.model.CarInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;
import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class CarMainController {

    private final CarInfoService carInfoService;

    @GetMapping("/car")
    public String mainPage(Model model) {
        model.addAttribute("carInfo", carInfoService.getCarInfo("Camaro SS"));
        return "carHello";
    }

    @GetMapping("/ss")
    public String pageSs() {
        return "ss";
    }

    @GetMapping("/z28")
    public String pageZ28() {
        return "z28";
    }

    @GetMapping("/z28_2010")
    public String pageZ28_2010() {
        return "z28_2010";
    }


    @GetMapping("/edit/{modelName}")
    public String editCarInfo(@PathVariable String modelName, Model model) {
        CarInfo carInfo = carInfoService.getCarInfo(modelName);
        model.addAttribute("carInfo", carInfo);
        return "edit" + modelName;
    }

    @PostMapping("/edit/{modelName}")
    public String processEditCarInfo(
            @PathVariable String modelName,
            @Valid @ModelAttribute CarInfo updatedCarInfo,
            BindingResult bindingResult,
            Model model) {

        if (bindingResult.hasErrors()) {
            throw new ValidationException("Validation error occurred");
        }

        try {
            carInfoService.updateCarInfo(modelName, updatedCarInfo);
            model.addAttribute("carInfo", updatedCarInfo);
            return "redirect:/car";
        } catch (Exception e) {
            return "error";
        }
    }
}