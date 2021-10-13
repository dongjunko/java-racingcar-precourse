package Model;

public class RacingCarProgress {
    private String progress;

    public RacingCarProgress() {
        this.progress = "";
    }
    public void moveOneBlock() {
        this.progress += "-";
    }

    public String getProgressView() {
        return this.progress;
    }

    public int getProgressLength() {
        return this.progress.length();
    }
}
