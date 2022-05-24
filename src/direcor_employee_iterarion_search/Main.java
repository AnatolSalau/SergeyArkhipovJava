package direcor_employee_iterarion_search;

class Main {
    public static void main(String[] args) {
        /*
        * 1) Необходимо создать 3 работника и 1 директора.
         */
        Worker workerOne = new Worker("Ivan","Ivanov",1);
        Worker workerTwo = new Worker("Petr","Petrov",2);
        Worker workerThree = new Worker("Vasya","Vasyliev",3);

        Director directorOne = new Director("Sidr","Sidorov",4);

        directorOne.addOneOrMoreEmployees(workerOne,workerTwo,workerThree);

        boolean result = SearchingInformation.isNameInArrayEmployees("Sidr", directorOne);
        System.out.println(result);

     }

}
