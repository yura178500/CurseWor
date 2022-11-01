public class Employee {
    private String firstName;
    private String patronymic;
    private String lastName;
    private float salary;
    private int departement;
    private final int id;
    public static int idCounter = 0;

    public Employee(String firstName, String lastName, String patronymic, int departement, float salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.salary = salary;
        this.departement = departement;
        this.id = idCounter;
        idCounter++;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setDepartement(int departement) {
        this.departement = departement;
    }

    public float getSalary() {
        return this.salary;
    }


    public int getDepartment() {
        return this.departement;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String toString() {
        return "Идификатор: " + this.id + " Отдел: " + this.departement + " Имя: " + this.firstName + " Фамилия: "
                + this.lastName + " Зарплата: " + this.salary;
    }
}

