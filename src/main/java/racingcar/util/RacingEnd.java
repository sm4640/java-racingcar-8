package racingcar.util;

import java.util.ArrayList;
import java.util.List;

public class RacingEnd {
    public static List<String> checkWinner(
            List<String> carName,
            List<String> carMoveDistance){
        // for문으로 carMoveDistance 길이 재서 1등들 이름 새로운 list에 넣기
        List<String> winnerList = new ArrayList<>();

        int maxDistance = 0;
        for (String distance : carMoveDistance) {
            maxDistance = Math.max(maxDistance, distance.length());
        }

        for (int i = 0; i < carName.size(); i++) {
            if (carMoveDistance.get(i).length() == maxDistance) {
                winnerList.add(carName.get(i));
            }
        }

        return winnerList;
    }
}
