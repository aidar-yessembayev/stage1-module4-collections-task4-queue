package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> result = new ArrayList<>();

        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            list.add(i);
        }

        int current = 0;
        while (!list.isEmpty()) {

            if (list.size() == 1) {
                result.add(list.remove(0));

            } else {
                for (int i = 0; i < everyDishNumberToEat; i++) {

                    if (current == list.size()) {
                        current = 0;
                    }

                    current++;
                }

                result.add(list.remove(current-1));
                current -= 1;
            }
        }

        return result;
    }
}
