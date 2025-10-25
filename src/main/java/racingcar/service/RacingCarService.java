package racingcar.service;

import racingcar.util.RacingEnd;
import racingcar.util.RacingProgress;
import racingcar.util.RacingSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RacingCarService {
    public List<String> Racing(String carsName, int tryCount){

        List<String> carNameList = RacingSet.setCarNameList(carsName);
        List<String> carMoveDistance = new ArrayList<>(Collections.nCopies(carNameList.size(), ""));

        for (int round = 0; round < tryCount; round++){
            System.out.println("\n실행 결과");
            RacingProgress.updateCarMoveDistance(carMoveDistance);
            RacingProgress.printCarMoveDistance(carNameList ,carMoveDistance);
            System.out.println();
        }

        return RacingEnd.checkWinner(carNameList, carMoveDistance);
    }
}
