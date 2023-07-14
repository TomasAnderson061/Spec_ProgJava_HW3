//  1. Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main1 {
    public static void main(String[] args) {
        Random rndNumb = new Random();
        int n = 10;
        List<Integer> list = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            list.add(rndNumb.nextInt(100));
        }
        System.out.println(list);
        removeEvens(list);
    }

    static void removeEvens(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
        // for (int i = 0; i <= list.size(); i++) {
            if ((list.get(i) % 2) == 0 && list.get(i)!=0) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}