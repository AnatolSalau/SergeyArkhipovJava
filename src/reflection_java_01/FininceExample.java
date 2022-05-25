package reflection_java_01;

public class FininceExample {
    public static void main(String[] args) {
        // Получаем нужный объект
        FinanceInfoBuilder fib = FinanceInfoBuilderFactory.getFinanceInfoBuilder();
        // Вызываем метод
        FinanceInformation info = fib.buildFinacneInformation();
        // Вызов getClass() позволяет получить описание класса у объекта
        System.out.println("Name:" + fib.getClass().getCanonicalName());
        // Дальше можем делать с полученной информацией все, что захотим
    }
}
