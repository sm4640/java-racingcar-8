package racingcar.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarServiceTest {

    private final RacingCarService racingCarService = new RacingCarService();

    @Test
    @DisplayName("setGame은 이름 문자열을 입력받아서 ','기준으로 공백제거 후 Car객체 리스트를 생성함")
    public void setGameReturnCorrectCarList() {
        String inputNames = "pobi, tobi,tubi";

        List<Car> cars = racingCarService.setGame(inputNames);

        assertThat(cars)
                .hasSize(3)
                .extracting(Car::getName)
                .containsExactly("pobi", "tobi", "tubi");
    }
}
