package Model;


import Constants.Constants;

import java.util.Arrays;
import java.util.List;

public class RacingCarNames {
    private String carNames;

    public RacingCarNames(String names) {
        validate(names);
        carNames = names;
    }

    public String getCarNames() {
        return carNames;
    }

    private void validate(String names) {
        List<String> nameArr = Arrays.asList(names.split(","));
        if (names.split(",").length < 2)
            throw new IllegalArgumentException(Constants.EXCEPTION_MESSAGE_HEADER + Constants.EXCEPTION_MESSAGE_CARLENGTH);
        for (String name : nameArr) {
            validateNameLength(name);
        }
    }

    private void validateNameLength(String name) {
        if (name.length() > 5)
            throw new IllegalArgumentException(Constants.EXCEPTION_MESSAGE_HEADER + Constants.EXCEPTION_MESSAGE_CARNAMELENGTH);
    }

}
