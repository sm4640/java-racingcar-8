package racingcar.util;

import java.util.List;

public class RacingSet {
    public static List<String> setCarNameList(String CarNameOfString){
        List<String> carNameList = List.of(CarNameOfString.split(","));

        for (String carName: carNameList){
            if (carName.length() > 5){
                throw new IllegalArgumentException("car name is longer than 5");
            }
        }

        return carNameList;
    }
}
