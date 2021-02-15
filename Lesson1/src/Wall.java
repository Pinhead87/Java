public class Wall extends Obstacle {

    public Wall(int height) {
        this.size = height;
    }

    @Override
    boolean passThroughObstacle(RunAndJump competitor) {
        competitor.jump();
        return competitor.getMaxJumpHeight() > size;
    }
}
