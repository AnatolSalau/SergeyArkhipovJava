package queue_realization_string_array;

public class Main {
    public static void main(String[] args) {
        SimpleQueueString simpleQueueOne = new SimpleQueueString(5);
        simpleQueueOne.add("1");
        simpleQueueOne.add("2");
        simpleQueueOne.add("3");
        simpleQueueOne.add("4");
        simpleQueueOne.add("5");
        simpleQueueOne.add("6");
        System.out.println(simpleQueueOne.get());
        System.out.println(simpleQueueOne.get());
        System.out.println(simpleQueueOne.get());
        System.out.println(simpleQueueOne.get());
        System.out.println(simpleQueueOne.get());
        System.out.println(simpleQueueOne.get());
        simpleQueueOne.printQueue();
        simpleQueueOne.add("1");

    }
}
