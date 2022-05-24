package queue_realization_generic;

import java.util.Arrays;

public class SimpleQueueGeneric<T> implements QueueGeneric<T> {
    private T[] queue;
    private int lastIndex;

    public SimpleQueueGeneric(T[] maxLengthQueue) {
        queue = maxLengthQueue;
        lastIndex = queue.length - 1;
    }

    public void printQueue() {
        System.out.println(Arrays.toString(queue));
    }

    @Override
    public void add(T item) {
        //  Проверяем есть ли место в конце очереди
        if(queue[lastIndex] == null) {
            //  Бежим с начала очереди и записываем в первый свободный элемент
            for (int i = 0; i < queue.length; i++) {
                if (queue[i] == null) {
                    queue[i] = item;
                    break;
                }
            }
        }
        else {
            //Возвращаем ошибку
            System.out.println("EXCEPTION! Queue is full, cant add element");
        }
    }

    @Override
    public T get() {
        T result = queue[0];
        //Проверяем пуста ли очередь
        if (!isEmpty()) {
            //Сдвигаем все эелементы на один к началу
            for (int i = 0; i < queue.length-1; i++) {
                queue[i] = queue[i+1];
            }
            //всегда меняем последний индекс на null, чтобы не осталось старого значения
            queue[lastIndex] = null;
            return result;
        }
        //Если пуста возвращаем ошибку
        else {
            System.out.println("EXCEPTION! Queue is empty");
            return result;
        }
    }

    @Override
    public boolean isEmpty() {
        if (queue[0] == null) {
            return true;
        }
        else return false;
    }
}
