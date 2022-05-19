package stack_realization_string_array;

public class Main {
    public static void main(String[] args) {
        SimpleStackString simpleStackString = new SimpleStackString(5);
        System.out.println(simpleStackString.isEmpty());
        simpleStackString.push("1");
        simpleStackString.push("2");
        simpleStackString.push("3");
        simpleStackString.push("4");
        simpleStackString.push("5");
        simpleStackString.printStack();
        simpleStackString.push("6");
        System.out.println(simpleStackString.pop());
        System.out.println(simpleStackString.pop());
        System.out.println(simpleStackString.pop());
        System.out.println(simpleStackString.pop());
        System.out.println(simpleStackString.pop());
        simpleStackString.printStack();
        System.out.println(simpleStackString.pop());
    }
}
