package reflection_java_01;

public class FinanceInfoBuilderFactory {
    public static FinanceInfoBuilder getFinanceInfoBuilder() {
        // Обратите внимание, что здесь мы ВЫНУЖДЕНЫ писать реальный класс
        // Хорошо, что это мы делаем только в одном месте, ане в каждой
        // строке, где нам потребуется обращение к FinanceInfoBuilder
        return new DbFinanceInfoBuilder();
        // Теперь мы создаем объект другого класса WebFinanceInfoBuilder
//        return new WebFinanceInfoBuilder();
    }
}
