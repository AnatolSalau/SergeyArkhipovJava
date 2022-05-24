package direcor_employee_iterarion_search;

class PrintInformation {

    static void printTostring (Employee... employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
        System.out.println();
    }

}
