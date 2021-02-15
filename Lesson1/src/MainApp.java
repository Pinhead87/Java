import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random rn = new Random();
        RunAndJump[] competitors = {
                new Human("Johnny", rn.nextInt(100) + 1, rn.nextInt(10) + 1),
                new Cat("Felix", rn.nextInt(100) + 1, rn.nextInt(10) + 1),
                new Human("Alan", rn.nextInt(100) + 1, rn.nextInt(10) + 1),
                new Robot("Chappie", rn.nextInt(100) + 1, rn.nextInt(10) + 1),
                new Cat("Leo", rn.nextInt(100) + 1, rn.nextInt(10) + 1),
                new Robot("T-800", rn.nextInt(100) + 1, rn.nextInt(10) + 1)
        };
        Obstacle[] obstacles = {
                new RunningTrack(50),
                new Wall(5),
                new RunningTrack(70)
        };
        for(RunAndJump r: competitors) {
            int passed = 0;
            for(Obstacle o: obstacles) {
                if(o.passThroughObstacle(r)) {
                    System.out.println(r + " successfully passed an obstacle!");
                    passed++;
                } else {
                    System.out.println(r + " failed to pass an obstacle!");
                    break;
                }
            }
            if(passed == obstacles.length) {
                System.out.println(r + " is a winner!");
            }
        }
    }
}
