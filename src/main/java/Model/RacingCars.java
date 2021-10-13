package Model;

import Constants.Constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingCars {
    private List<RacingCar> racingCars;

    public RacingCars(String input) {
        this.racingCars = generateCars(input);
    }

    public List<RacingCar> getRacingCars() {
        return racingCars;
    }

    private List<RacingCar> generateCars(String input) {
        List<RacingCar> cars = new ArrayList<>();
        List<String> carNamesList = Arrays.asList(input.split(","));
        if (carNamesList.size() < 2)
            throw new IllegalArgumentException(Constants.EXCEPTION_MESSAGE_HEADER + Constants.EXCEPTION_MESSAGE_CARLENGTH);
        for (String carName : carNamesList) {
            RacingCar car = new RacingCar(carName);
            cars.add(car);
        }
        return cars;
    }

    public List<RacingCar> getWinners() {
        List<RacingCar> winners = new ArrayList<>();
        int maxProgress = getMaxProgress(racingCars);
        for (RacingCar car : racingCars) {
            checkCarIsWinner(winners, car, maxProgress);
        }
        return winners;
    }

    private void checkCarIsWinner(List<RacingCar> cars, RacingCar car, int maxProgress) {
        if (car.getProgress().getProgressLength() == maxProgress)
            cars.add(car);
    }

    private int getMaxProgress(List<RacingCar> cars) {
        int maxProgress = 0;
        for (RacingCar car : cars) {
            maxProgress = (maxProgress < car.getProgress().getProgressLength() ? car.getProgress().getProgressLength() : maxProgress);
        }
        return maxProgress;
    }

    public void run() {
        for (RacingCar car : racingCars) {
            car.run();
        }
    }
}
