package nextstep.test;

import Constants.Constants;
import Model.RacingCarNames;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RacingCarNamesTest {
    @Test
    @DisplayName("자동차 이름 입력이 정상적으로 동작하는지 테스트")
    void racingCarsNamesTest() {
        assertThatThrownBy(() -> {
            new RacingCarNames("자동차1");
        }).isInstanceOf(IllegalArgumentException.class).hasMessageContaining(Constants.EXCEPTION_MESSAGE_HEADER + Constants.EXCEPTION_MESSAGE_CARLENGTH);
        assertThatThrownBy(() -> {
            new RacingCarNames("자동차1,자동차2,자동차12345");
        }).isInstanceOf(IllegalArgumentException.class).hasMessageContaining(Constants.EXCEPTION_MESSAGE_HEADER + Constants.EXCEPTION_MESSAGE_CARNAMELENGTH);
        assertThat(new RacingCarNames("자동차1,자동차2,자동차3").getCarNames()).isEqualTo("자동차1,자동차2,자동차3");
    }
}
