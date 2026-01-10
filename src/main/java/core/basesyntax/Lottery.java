package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {

        int randomNumber = random.nextInt(MAX_NUMBER) + 1;
        String color = colorSupplier.getRandomColor();

        return new Ball(color, randomNumber);

    }
}
