package Shildt.Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class QueueExample {
    void que() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("1Zaur"); // add если заканчивается очередь выбрасывает исключение
        queue.offer("2Oleg"); // offer нне выбрасывает
        queue.offer("3Ivan");
        queue.offer("4Mariya");
        queue.offer("5Aleksandr");
        System.out.println(queue);
//        add, remoove
        queue.remove(); // удаляет 0
//        System.out.println(queue);
//        queue.remove("5Aleksandr");
//        System.out.println(queue);
//        System.out.println(queue.poll()); // вместо ремов, только не выбрасывает иксепшн
        System.out.println(queue.element()); // кто первый на очереди?
        System.out.println(queue.peek()); // кто первый на очереди, но не выбрасывает иксепшн?

    }

    void priorityQueExamole () {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(10);
        priorityQueue.add(7);
        priorityQueue.add(8);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek() + " натуральная сортировка");
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue);
    }
}

public class QueueEx {
    public static void main(String[] args) {
        QueueExample qE = new QueueExample();
//        qE.que();
        qE.priorityQueExamole();

    }
}
