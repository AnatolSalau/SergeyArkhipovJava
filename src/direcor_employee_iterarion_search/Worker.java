package direcor_employee_iterarion_search;

class Worker extends Employee {

/*
 * Убрал Position в параметрах конструктора, теперь директор создается только директором,
 *  а рабочий только рабочим*/
    public Worker(String name, String secondName, double workExperience) {
        super(name, secondName, workExperience, Position.WORKER);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", workExperience=" + workExperience +
                ", position=" + position +
                ", salary=" + salary +
                "}";
    }
}
