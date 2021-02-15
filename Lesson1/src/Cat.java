public class Cat implements RunAndJump {
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
        return "Cat " + name;
    }

    public Cat(String name, int maxRunLength, int maxJumpHeight) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void jump() {
        System.out.println("Cat " + name + " jump " + maxJumpHeight + " m");
    }

    @Override
    public void run() {
        System.out.println("Cat " + name + " run " + maxRunLength + " m");
    }

    @Override
    public void runAndJump() {
        System.out.println();
    }
}
