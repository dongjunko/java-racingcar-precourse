package Model;

import nextstep.utils.Randoms;

public class RacingCar {
    private RacingCarName name;
    private RacingCarProgress progress;

    public RacingCar(String carName) {
        this.name = new RacingCarName(carName);
        this.progress = new RacingCarProgress();
    }

    public RacingCarName getRacingCarName() {
        return name;
    }

    public void moveOneBlock() {
        this.progress.moveOneBlock();
    }

    public RacingCarProgress getProgress() {
        return progress;
    }

    public void run() {
        int diceValue = Randoms.pickNumberInRange(1, 9);
        if(diceValue >= 4) {
            moveOneBlock();
        }
    }
}
