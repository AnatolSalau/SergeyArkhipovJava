package reflection_java_01;
/*
 * Реализация интерфейса FinanceInfoBuilder
 * которая работает с информацией из базы данных
 */
class DbFinanceInfoBuilder implements FinanceInfoBuilder{
        // Тут мы ходим в базу данных - как-будто
        @Override
        public FinanceInformation buildFinacneInformation() {
            System.out.println("Вызов метода для объекта DbFinanceInfoBuilder");
            return new FinanceInformation();
        }

}
