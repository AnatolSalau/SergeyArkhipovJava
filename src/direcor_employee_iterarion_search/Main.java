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
        Director directorTwo = new Director("Dasha","Sidorov",4);
        Worker workerFour = new Worker("Four","Vasyliev",3);
        Worker workerFive = new Worker("Five","Vasyliev",3);
        directorTwo.addOneOrMoreEmployees(workerFour,workerFive,directorOne);

        Director directorThree = new Director("Director three", "Three", 5);
        Worker workerSeven = new Worker("Seven","Vasyliev",3);
        Worker workerSix = new Worker("Six","Vasyliev",3);
        directorThree.addOneOrMoreEmployees(directorTwo,workerSeven,workerSix);

        PrintInformation.printTostring(directorThree);

        boolean result = SearchingInformation.isNameInArrayEmployees("Vasya", directorTwo);
        System.out.println(result);

        boolean resultTwo = SearchingInformation.isNameInArrayEmployees("Vasya", directorTwo,directorOne);
        System.out.println(resultTwo);
     }

}
