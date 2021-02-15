// абстрактный класс - препятствие
public abstract class Obstacle {
    protected int size;
    abstract boolean passThroughObstacle(RunAndJump competitor);
}
