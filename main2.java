//    2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
// Collections.max()

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class main2 {

    public static void main(String[] args) {
        Random rndNumb = new Random();
        int n = 10;
        float avgOfNumb, sumOfNumb = 0;
        List<Integer> list = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            list.add(rndNumb.nextInt(100));
            sumOfNumb += list.get(i);
        }
        // System.out.printf("Исходный список: %d\n", listNumb);
        Collections.sort(list);
        avgOfNumb = sumOfNumb / n;
        // System.out.printf("Отсортированный список: %d\n", listNumb);
        System.out.printf("Минимальный элемент= %d\n", Collections.min(list));
        System.out.printf("Максимальный элемент= %d\n", Collections.max(list));
        System.out.printf("Среднее арифметическое значение: %d\n", avgOfNumb);

    }
}
