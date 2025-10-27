package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class CarTest {

    @Test
    @DisplayName("자동차 이름이 5글자를 초과하면 예외 발생")
    void validateCarNameLength() {
        assertThatThrownBy(() -> new Car("asdfgh"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("자동차 이름이 비어있는 경우 예외 발생")
    void validateCarNameBlank() {
        assertThatThrownBy(() -> new Car(""))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("랜덤값이 4 이상일 때 distance가 1 증가해야 됨")
    void moveWhenRandomNumberIs4OrMore() {
        Car car = new Car("pobi");
        car.move(4);
        assertThat(car.getDistance()).isEqualTo(1);
    }

    @Test
    @DisplayName("랜덤값이 4 미만일 때 distance가 바뀌면 안 됨")
    void stayWhenRandomNumberIsLessThan4() {
        Car car = new Car("pobi");
        car.move(3);
        assertThat(car.getDistance()).isEqualTo(0);
    }
}
