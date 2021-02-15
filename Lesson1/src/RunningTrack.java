public class RunningTrack extends Obstacle {

    public RunningTrack(int length) {
        this.size = length;
    }

    @Override
    boolean passThroughObstacle(RunAndJump competitor) {
        competitor.run();
        return competitor.getMaxRunLength() > size;
    }
}
