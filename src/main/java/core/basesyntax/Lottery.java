package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public String getRandomBall() {

        return new Ball(colorSupplier.getRandomColor(), random.nextInt(100)).toString();

    }
}
