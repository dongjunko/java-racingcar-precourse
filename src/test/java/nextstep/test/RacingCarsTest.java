package nextstep.test;

import Constants.Constants;
import Model.RacingCar;
import Model.RacingCars;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

public class RacingCarsTest {

    @ParameterizedTest
    @DisplayName("입력된 갯수만큼의 자동차들이 정상적으로 생성되는지 테스트")
    @CsvSource(value={"자동차1,자동차2,자동차3|3", "car1,car2,car3,car4,car5,car6,car7|7", "car1,car2|2"}, delimiter = '|')
    void racingCarsTest(String carNameInput, String carCount) {
        List<RacingCar> racingCars = new RacingCars(carNameInput).getRacingCars();
        assertThat(racingCars.size()).isEqualTo(Integer.parseInt(carCount));
    }
}
