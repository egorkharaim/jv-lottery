package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
   private final Random random = new Random();

    public String getRandomColor() {
        // [CHECKLIST #2] Возвращаем значение сразу, без промежуточной переменной randomIndex
        return Colors.values()[random.nextInt(Colors.values().length)].name();
    }
}
