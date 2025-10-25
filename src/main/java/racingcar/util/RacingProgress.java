package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class RacingProgress {
    public static void updateCarMoveDistance(List<String> carMoveDistance){
        for(int i = 0; i < carMoveDistance.size(); i++){
            if(Randoms.pickNumberInRange(0, 9) >= 4){
                carMoveDistance.set(i, carMoveDistance.get(i) + "-");
            }
        }
    }
}
