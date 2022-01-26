package gof.comportamental.observer;

public class CricketData {

    int runs, wickets;
    float overs;
    CurrentScoreDisplay currentScoreDisplay;
    AverageScoreDisplay averageScoreDisplay;

    public CricketData(CurrentScoreDisplay currentScoreDisplay, AverageScoreDisplay averageScoreDisplay) {
        this.currentScoreDisplay = currentScoreDisplay;
        this.averageScoreDisplay = averageScoreDisplay;
    }

    private int getLatestRuns() {
        return 90;
    }

    private int getLastestWickets() {
        return 2;
    }

    private float getLastestOvers() {
        return (float) 10.2;
    }

    public void dataChanged() {
        runs = getLatestRuns();
        wickets = getLastestWickets();
        overs = getLastestOvers();

        currentScoreDisplay.update(runs, wickets, overs);
        averageScoreDisplay.update(runs, wickets, overs);
    }
}
