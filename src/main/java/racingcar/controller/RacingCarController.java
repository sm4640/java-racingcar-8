package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.service.RacingCarService;

import java.util.List;

public class RacingCarController {
    private final RacingCarService racingCarService = new RacingCarService();

    public void run(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carsName = Console.readLine();

        System.out.println("시도할 횟수는 몇 회인가요?");
        int tryCount = Integer.parseInt(Console.readLine());

        List<String> racingWinnerList = racingCarService.Racing(carsName, tryCount);

        System.out.println("최종 우승자 : " + String.join(", ", racingWinnerList));
    }
}
