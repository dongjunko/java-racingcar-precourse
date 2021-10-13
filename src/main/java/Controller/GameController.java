package Controller;

import Model.GameCount;
import Model.RacingCarNames;
import Model.RacingCars;
import Model.Winners;
import View.GameView;

public class GameController {

    public void runRacingApplication() {
        startGame();
        return;
    }

    public void startGame() {
        GameView view = new GameView();
        RacingCarNames carNames = view.getCarNames();
        RacingCars cars = new RacingCars(carNames.getCarNames());
        GameCount gamesCount = new GameCount(view.getGameCount());
        cars = race(cars, gamesCount);
        Winners winners = new Winners(cars.getWinners());
        view.showRaceResult(cars);
        view.showWinners(winners);
    }

    public RacingCars race(RacingCars cars, GameCount gameCount) {
        for(int i = 0; i < gameCount.getCount(); i++) {
            cars.run();
        }
        return cars;
    }

}
