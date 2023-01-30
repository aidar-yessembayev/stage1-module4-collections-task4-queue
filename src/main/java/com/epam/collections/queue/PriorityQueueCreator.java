package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> first = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<String> last = new PriorityQueue<>(Comparator.reverseOrder());

        if (!(firstList.isEmpty() && secondList.isEmpty())) {

            if (!firstList.isEmpty()) {
                for (String i : firstList) {
                    first.add(i);
                }
            }

            if (!secondList.isEmpty()) {
                for (String i : secondList) {
                    first.add(i);
                }
            }

            int size = first.size();
            for (int i = 0; i < size; i++) {
                last.add(first.poll());
            }
        }

        return last;
    }
}
