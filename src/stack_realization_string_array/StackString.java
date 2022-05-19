package stack_realization_string_array;

public interface StackString {
    //добавить элемент на вершину стэка
    void push(String item);
    //взять элемент с вершины стэка
    String pop();
    //проверить пустой ли стэк
    boolean isEmpty();
}
