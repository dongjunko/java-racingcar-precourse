package View;

import Constants.Constants;
import Model.*;
import nextstep.utils.Console;

public class GameView {
    public RacingCarNames getCarNames() {
        RacingCarNames names = null;
        System.out.println(Constants.MESSAGE_ENTERTHECARNAME);
        try {
            names = new RacingCarNames(getUserInput());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return getCarNames();
        }
        return names;
    }

    public String getGameCount() {
        System.out.println(Constants.MESSAGE_ENTERTHEGAMECOUNT);
        return getUserInput();
    }

    public String getUserInput() {
        String userInput = Console.readLine();
        return userInput;
    }

    public void showRaceResult(RacingCars cars) {
        for(RacingCar car : cars.getRacingCars()) {
            System.out.println(car.getRacingCarName().getValue() + " : " + car.getProgress().getProgressView());
        }
    }

    public void showWinners(Winners winners) {
        String resultView = "최종 우승자는 ";
        for(RacingCar car : winners.getWinners()) {
            resultView += car.getRacingCarName().getValue() + ",";
        }
        resultView = resultView.substring(0, resultView.length() - 1);
        resultView += " 입니다.";
        System.out.println(resultView);
    }
}
