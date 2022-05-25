package tree_binary_iteration_deep_search;

import queue_realization_generic.SimpleQueueGeneric;
import queue_realization_string_array.SimpleQueueString;
import stack_realization_generic.SimpleStackGeneric;
import tree_binary_reqursion_deep_search.BinaryTree;

public class SummingTreeValuesIteration {

    public static int sumIterableStack (BinaryTree root) {
        SimpleStackGeneric<BinaryTree> stack = new SimpleStackGeneric<>(new BinaryTree[20]);
        //Добавляем в стэк корневой узел
        stack.push(root);
        int sum = 0;
        while (! stack.isEmpty()) {
            //достаем из стэка корневой узел
            BinaryTree node = stack.pop();
            System.out.println(node.getValue());
            //Добавляем его значение в сумму значений
            sum = sum + node.getValue();
            //Проверяем есть ли у него ветки
            //Если есть кладем ветки в стэк
            if (node.getRight() != null) {
                stack.push(node.getRight());
            }
            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }
        }
        return sum;
    }
    public static int sumIterableQueue (BinaryTree root) {
        SimpleQueueGeneric<BinaryTree> stack = new SimpleQueueGeneric<>(new BinaryTree[20]);
        //Добавляем в стэк корневой узел
        stack.add(root);
        int sum = 0;
        while (! stack.isEmpty()) {
            //достаем из стэка корневой узел
            BinaryTree node = stack.get();
            System.out.println(node.getValue());
            //Добавляем его значение в сумму значений
            sum = sum + node.getValue();
            //Проверяем есть ли у него ветки
            //Если есть кладем ветки в стэк
            if (node.getRight() != null) {
                stack.add(node.getRight());
            }
            if (node.getLeft() != null) {
                stack.add(node.getLeft());
            }
        }
        return sum;
    }
}
