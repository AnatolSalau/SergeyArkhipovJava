package queue_realization_string_array;

public interface QueueString {
//    Добавить элемент в конец очереди
    void add(String item);
//    Извлечение элемента из начала очереди
    String get();
//    Проверяем пустая ли очередь или нет
    boolean isEmpty();
}
