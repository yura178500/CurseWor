public class Main {
    public static void main(String[] args) {

        Employee[] Employees = new Employee[10];
        Employees[0] = new Employee("Иванов","Иван","Иванович", 1, 50000);
        Employees[1] = new Employee("Петров","Петр","Петрович", 1, 56000);
        Employees[2] = new Employee("Сидоров","Сидор","Сидорович", 2, 53500);
        Employees[3] = new Employee("Кириллов","Иван","Иванович", 2, 50000);
        Employees[4] = new Employee("Урюпин","Эльдар","Петрович", 3, 55000);
        Employees[5] = new Employee("Курков","Юрий","Сидорович", 3, 58000);
        Employees[6] = new Employee("Юрьевич","Олег","Сидорович", 4, 52000);
        Employees[7] = new Employee("Новосёлов","Илья","Иванович", 4, 50000);
        Employees[8] = new Employee("Хиночек","Петр","Петрович", 5, 55000);
        Employees[9] = new Employee("Решетов","Сидор","Сидорович", 6, 53000);

        System.out.println("=========================================================================================");

        DataBasa.addEmployee(Employees);
        DataBasa.sumSalary(Employees);
        DataBasa.EmployeeWithMaxSalary(Employees);
        DataBasa.EmployeeWithMinSalary(Employees);
        DataBasa.Average(Employees);

        System.out.println("=========================================================================================");

        Employees[2].setDepartement(2);
        Employees[1].setSalary(70000f);
        Employees[0].setFirstName("");
        Employees[3].setLastName("");

        System.out.println("=========================================================================================");


        DataBasa.EmployeeWithMaxSalary(Employees);
        DataBasa.EmployeeWithMinSalary(Employees);
        DataBasa.addEmployee(Employees);
        DataBasa.sumSalary(Employees);
        DataBasa.Average(Employees);

        System.out.println("=========================================================================================");


        float percent =0.3f;
        DataBasa.percentSalary(Employees,percent);
        byte number=4;

        System.out.println("=========================================================================================");

        DataBasa.department(Employees,number);
        DataBasa.departmentMaxSalary(Employees,number);
        DataBasa.departmentMinSalary(Employees,number);
        DataBasa.departmentSalarySum(Employees,number);
        DataBasa.departmentArgeSalary(Employees,number);
        percent=0.3f;
        DataBasa.departmentPercentSalary(Employees,number,percent);
        System.out.println("=========================================================================================");
        float highSalary=30_000f;
        DataBasa.compareHigherSalary(Employees,highSalary);
        float lowSalary=15_000f;
        DataBasa.compareSalary(Employees,lowSalary);

    }
}