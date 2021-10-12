package nextstep.test;

import Model.RacingCar;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class RacingCarTest {
    @Test
    @DisplayName("자동차 기능들이 올바르게 동작하는지 테스트")
    void RacingCarTest() {
        RacingCar car = new RacingCar("자동차1");
        assertThat(car.getRacingCarName().getValue()).isEqualTo("자동차1");
        car.moveOneBlock();
        assertThat(car.getProgress().getProgressView()).isEqualTo("-");
        car.moveOneBlock();
        assertThat(car.getProgress().getProgressView()).isEqualTo("--");
    }
}
