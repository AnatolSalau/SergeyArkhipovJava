package stack_realization_generic;

import stack_realization_string_array.StackString;

import java.util.Arrays;

public class SimpleStackGeneric<T> implements StackGeneric<T> {
    private T[] stack;
    private int lastIndex;

    public SimpleStackGeneric(T[] maxLengthStack) {
        stack = maxLengthStack;
        lastIndex = stack.length - 1;
    }
    public void printStack() {
        System.out.println(Arrays.toString(stack));
    }

    //Толкаем элемент в стэк
    @Override
    public void push(T item) {
        //  Проверяем есть ли место в конце стэка
        if(stack[lastIndex] == null) {
            //  Бежим с начала стэка и записываем в первый свободный элемент
            for (int i = 0; i < stack.length; i++) {
                if (stack[i] == null) {
                    stack[i] = item;
                    break;
                }
            }
        }
        else {
            //Возвращаем ошибку
            System.out.println("EXCEPTION! Stack is full, cant add element");
        }

    }
    //Тянем элемент из стэка
    @Override
    public T pop() {
        //Проверяем пуст ли стэк
        if (!isEmpty()) {

            //проверяем пуст ли самый верхний элемент, если не пуст возвращаем
            if (stack[lastIndex] == null) {
                //Бежим по стэку и ищем первый null, тянем элемент перед ним
                for (int i = 0; i < stack.length - 1; i++) {
                    if ((stack[i+1]) == null) {
                        T result = stack[i];
                        stack[i] = null;
                        return result;
                    }
                }
            } else {
                T result = stack[lastIndex];
                stack[lastIndex] = null;
                return result;
            }
            return null;
        }
        //Если пуст возвращаем ошибку
        else {
            System.out.println("EXCEPTION! Stack is empty");
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        if (stack[0] == null) {
            return true;
        }
        else return false;
    }
}
