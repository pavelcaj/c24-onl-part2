package lesson39.model;

import lesson39.model.CarInfo;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CarInfoService {

    private final Map<String, CarInfo> carInfoMap = new HashMap<>();

    public CarInfoService() {

        carInfoMap.put("Camaro SS", new CarInfo("Camaro SS", "6.2L V8", 426, 4.6, 155));
        carInfoMap.put("Camaro Z / 28", new CarInfo("Camaro Z / 28", "7.0L V8", 505, 4.0, 180));
        carInfoMap.put("Camaro Z / 28 2010", new CarInfo("Camaro Z / 28 2010", "5.7L V8", 310, 5.3, 155));
    }

    public CarInfo getCarInfo(String modelName) {
        return carInfoMap.get(modelName);
    }

    public void updateCarInfo(String modelName, CarInfo updatedCarInfo) {
        carInfoMap.put(modelName, updatedCarInfo);
    }
}