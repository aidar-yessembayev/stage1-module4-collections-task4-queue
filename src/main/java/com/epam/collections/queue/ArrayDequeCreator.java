package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> result = new ArrayDeque<>();

        // Make from Queue Deque
        Deque<Integer> first = new LinkedList<>();
        Deque<Integer> second = new LinkedList<>();

        for (int i : firstQueue) {
            first.add(i);
        }

        for (int i : secondQueue) {
            second.add(i);
        }

        // Both take turns adding two cards to the ArrayDeque<Integer>
        result.addLast(first.pollFirst());
        result.addLast(first.pollFirst());

        result.addLast(second.pollFirst());
        result.addLast(second.pollFirst());

        while (!(first.isEmpty() && second.isEmpty())) {
            // Takes the top card from the result and adds this card to the end of his first and last
            first.addLast(result.pollLast());
            second.addLast(result.pollLast());

            // Puts two cards from the beginning of his first and second into the result
            result.addLast(first.pollFirst());
            result.addLast(first.pollFirst());

            result.addLast(second.pollFirst());
            result.addLast(second.pollFirst());
        }

        return result;
    }
}
