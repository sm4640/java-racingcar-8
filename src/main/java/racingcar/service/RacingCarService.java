package racingcar.service;

import racingcar.domain.Car;
import racingcar.domain.RacingGame;

import java.util.Arrays;
import java.util.List;

public class RacingCarService {

    public List<Car> setGame(String inputNames) {
        List<Car> cars = Arrays.stream(inputNames.split(","))
                .map(String::trim)
                .map(Car::new)
                .toList();
        return cars;
    }

    public List<Car> runGame(List<Car> cars, int tryCount) {
        RacingGame game = new RacingGame(cars);

        System.out.println("\n실행 결과");
        for (int i = 0; i < tryCount; i++) {
            game.playRound();
            game.printCarMoveDistance();
        }

        List<Car> winners = game.getWinners();
        return winners;
    }
}
