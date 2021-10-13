package Model;

import java.util.List;

public class Winners {
    private List<RacingCar> winners;

    public Winners(List<RacingCar> winners) {
        this.winners = winners;
    }

    public List<RacingCar> getWinners() {
        return winners;
    }
}
