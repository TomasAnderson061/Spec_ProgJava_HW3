// 3. Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.
// Collections.frequency(list, 2)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class main3 {

    public static void main(String[] args) {

        String[] solarSystem = { "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун" };
        Random rndNumb = new Random();
        int n = 20;
        List<String> planets = new ArrayList<String>(n);
        for (int i = 0; i < n; i++) {
            int numbOfplanet = (rndNumb.nextInt(8));
            if (numbOfplanet == 1) {
                planets.add("Меркурий");
            } else if (numbOfplanet == 2) {
                planets.add("Венера");
            } else if (numbOfplanet == 3) {
                planets.add("Земля");
            } else if (numbOfplanet == 4) {
                planets.add("Марс");
            } else if (numbOfplanet == 5) {
                planets.add("Юпитер");
            } else if (numbOfplanet == 6) {
                planets.add("Сатурн");
            } else if (numbOfplanet == 7) {
                planets.add("Уран");
            } else if (numbOfplanet == 8) {
                planets.add("Нептун");
            }
        }
        System.out.println(planets);

        for (int i = 0; i < solarSystem.length; i++) {
            System.out.printf("%p повторяется в списке - %d раз(а)\n", solarSystem[i],
                    Collections.frequency(planets, solarSystem[i]));
        }

    }
}
