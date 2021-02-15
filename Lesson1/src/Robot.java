import java.math.BigInteger;

public class Robot implements RunAndJump {
    private final String name;
    private final int maxRunLength;
    private final int maxJumpHeight;

    public int getMaxRunLength() {
        return maxRunLength;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    @Override
    public String toString() {
        return "Robot " + name;
    }

    public Robot(String name, int maxRunLength, int maxJumpHeight) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void jump() {
        System.out.println("Robot " + name + " jump " + maxJumpHeight + " m");
    }

    @Override
    public void run() {
        System.out.println("Robot " + name + " run " + maxRunLength + " m");
    }

    @Override
    public void runAndJump() {
        System.out.println();
    }
}
