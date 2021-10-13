package Model;

public class GameCount {
    private int count;

    public GameCount(String count) {
        this.count = Integer.parseInt(count);
    }

    public int getCount() {
        return count;
    }
}
