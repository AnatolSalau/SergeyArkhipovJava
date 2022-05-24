package direcor_employee_iterarion_search;

import queue_realization_generic.SimpleQueueGeneric;
import tree_binary_reqursion_deep_search.BinaryTree;

class SearchingInformation {
/*
* Добавил еще один метод для поиска имени только у директора,
* и переименовал старый метод с  haveNameRecursion на isNameInArrayEmployees */
        public static boolean isNameInArrayEmployees(String name, Employee... employees) {
                //результат
                boolean haveName = false;
                //эмуляция стэка
                SimpleQueueGeneric<Employee> stack = new SimpleQueueGeneric<Employee>(new Employee[20]);
                for (Employee rootEmployee : employees) {
                        //Добавляем в стэк корневой узел
                        stack.add(rootEmployee);
                }
            while (! stack.isEmpty()) {
                //достаем из стэка корневой узел
                Employee nodeEmployee = stack.get();
                //                           System.out.println(nodeEmployee.toString());

                //Проверяем директор или нет наш сотрудник
                if (nodeEmployee instanceof Director) {
                    //если директор приводим его к директору
                    Employee[] newEmployees = ((Director) nodeEmployee).getArrayEmployees();
                    //бежим циклом по массиву сотрудников директора
                    for (Employee employee :newEmployees ) {
                        //Добавляем всех найденных директоров в стэк
                        if (employee instanceof Director) {
                            stack.add(employee);
                        }
                    }
                }
                else {
                    //меняем на true, если имя прошло проверку
                    if (nodeEmployee.getName().equals(name)) {
                        haveName = true;
                    }
                }
            }
                return haveName;
        }

}





