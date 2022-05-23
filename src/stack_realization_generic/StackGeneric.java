package stack_realization_generic;

public interface StackGeneric<T> {
    //добавить элемент на вершину стэка
    void push(T item);
    //взять элемент с вершины стэка
    T pop();
    //проверить пустой ли стэк
    boolean isEmpty();
}
