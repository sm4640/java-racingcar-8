package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    @Test
    @DisplayName("가장 멀리간 사람이 우승자이며, 동점자까지 우승자")
    void getWinnerCorrect() {
        List<Car> cars = List.of(
                new Car("pobi", 3),
                new Car("tobi", 5),
                new Car("tubi", 5)
        );

        RacingGame game = new RacingGame(cars);
        List<Car> winners = game.getWinners();

        assertThat(winners).extracting("name")
                .containsExactlyInAnyOrder("tobi", "tubi");
    }

}
