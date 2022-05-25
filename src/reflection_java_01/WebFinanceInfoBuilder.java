package reflection_java_01;

class WebFinanceInfoBuilder implements FinanceInfoBuilder{
    @Override
    public FinanceInformation buildFinacneInformation() {
        System.out.println("Вызов метода для объекта WebFinanceInfoBuilder");
        return new FinanceInformation();
    }
}
