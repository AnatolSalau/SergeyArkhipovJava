package queue_realization_generic;

public interface QueueGeneric<T> {
//    Добавить элемент в конец очереди
    void add(T item);

    //    Извлечение элемента из начала очереди
    T get();
//    Проверяем пустая ли очередь или нет
    boolean isEmpty();
}
