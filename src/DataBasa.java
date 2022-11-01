public class DataBasa {
    public static byte lengCount(Employee[] arr) {
        byte k = 0;
        for (byte i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                k++;
            }
        }
        return k;
    }

    public static void nullCout(Employee[] arr) {
        for (byte i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                throw new NullPointerException("Нет данных о сотруднике с идентификаторром " + i);
            }
        }
    }


    public static void addEmployee(Employee[] arr) {
        for (byte i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static float sumSalary(Employee[] arr) {
        float sum = 0f;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                sum += arr[i].getSalary();
            }
        }
        System.out.println("Сумарная зарплата: " + sum);
        return sum;
    }

    public static void EmployeeWithMaxSalary(Employee[] arr) {
        float max = 0f;
        byte k = 0;
        for (byte i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (max < arr[i].getSalary()) {
                    max = arr[i].getSalary();
                    k = i;
                }
            }
        }
        System.out.println("Максимальная зарплата у " + arr[k]);
    }

    public static void EmployeeWithMinSalary(Employee[] arr) {
        float min = arr[0].getSalary();
        byte k = 0;
        for (byte i = 1; i < arr.length; i++) {
            if (arr[i] != null) {
                {
                    if (min > arr[i].getSalary()) {
                        min = arr[i].getSalary();
                        k = i;
                    }
                }
            }
        }
        System.out.println("Минимальная зарплата у " + arr[k]);
    }

    public static void Average(Employee[] arr) {
        var l = lengCount(arr);
        var averageSalary = DataBasa.sumSalary(arr) / l;
        System.out.println("Средняя зарплата: " + averageSalary);
    }

    public static void percentSalary(Employee[] arr, float percent) {
        for (byte i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                arr[i].setSalary(arr[i].getSalary() + arr[i].getSalary() * percent);
            }
        }
        System.out.println("Зарплаты подняты на " + percent * 100 + " % ");
    }


    public static byte departmentPeopl(Employee[] arr, byte number) {
        byte j = 0;
        if (number > 6 || number < 1) {
            throw new IllegalArgumentException("Введен неверный отдел");
        } else {

            for (byte i = 0; i < arr.length; i++) {
                if (arr[i].getDepartment() == number) {
                    j++;
                }
            }
        }
        return j;
    }

    public static float departmentSalarySum(Employee[] arr, byte number) {
        float sum = 0f;
        if (departmentPeopl(arr, number) > 0) {
            for (byte i = 0; i < arr.length; i++) {
                if (arr[i].getDepartment() == number) {
                    sum = sum + arr[i].getSalary();
                }
            }
            System.out.println("В отделе " + number + " сумарная зарплата=" + sum);
        } else {
            System.out.println("В отделе " + number + " нет сотрудников");
        }
        return  sum;
    }

    public static void departmentArgeSalary(Employee[] arr, byte number) {
        float sum=departmentSalarySum(arr,number);
        byte k= departmentPeopl(arr, number);
        if (k>0){
            System.out.println("Средняя зарплата в отделе "+number+ ": "+sum/k);
        }
    }


    public static void departmentMaxSalary(Employee[] arr, byte number) {
        if (departmentPeopl(arr, number) > 0) {
            float max = 0f;
            byte t = 0;
            for (byte i = 0; i < arr.length; i++) {
                if (arr[i].getDepartment() == number) {
                    if (max < arr[i].getSalary()) {
                        max = arr[i].getSalary();
                        t = i;
                    }
                }
            }
            System.out.println("В отделе " + number + " максимальная зарплата " + max + " у " + arr[t].getLastName());
        } else {
            System.out.println("В отделе " + number + " нет сотрудников");
        }
    }

    public static void departmentMinSalary(Employee[] arr, byte number) {
        if (departmentPeopl(arr, number) > 0) {
            byte t = 0;
            float min = 70000000;
            for (byte i = 0; i < arr.length; i++) {
                if (arr[i].getDepartment() == number) {
                    if (min > arr[i].getSalary()) {
                        min = arr[i].getSalary();
                        t = i;
                    }
                }
            }
            System.out.println("В отделе " + number + " минимальная зарплата " + min + arr[t].getLastName());
        } else {
            System.out.println("В отделе " + number + " нет сотрудников");
        }
    }

    public static void departmentPercentSalary(Employee[] arr, byte number, float percent) {
        if (departmentPeopl(arr, number) > 0) {
            for (byte i = 0; i < arr.length; i++) {
                if (arr[i].getDepartment() == number) {
                    arr[i].setSalary(arr[i].getSalary() + arr[i].getSalary() * percent);
                }
            }
            System.out.println("В отделе " + number + " зарплата повышена на " + percent * 100 + " %");
        } else {
            System.out.println("В отделе " + number + " нет сотрудников");
        }

    }

    public static void department(Employee[] arr, byte number) {
        if (departmentPeopl(arr, number) > 0) {
            System.out.println("Сотрудники отдела " + number+" :");
            for (byte i = 0; i < arr.length; i++) {
                if (arr[i].getDepartment() == number) {
                    System.out.println(arr[i].getFirstName() + " " + arr[i].getLastName());

                }
            }
        } else {
            System.out.println("В отделе " + number + " нет сотрудников");
        }

    }

    public static void compareSalary(Employee[] arr, float salary){
        for (byte i = 0; i < arr.length; i++){
            if (arr[i]!=null){
                if(arr[i].getSalary()<salary){
                    System.out.println("Зарплата работника "+arr[i].getLastName()+ " меньше введенной " +
                            " и равна= "+arr[i].getSalary());
                }
            }
        }
    }

    public static void compareHigherSalary(Employee[] arr, float salary){
        for (byte i = 0; i < arr.length; i++){
            if (arr[i]!=null){
                if(arr[i].getSalary()>salary){
                    System.out.println("Зарплата работника "+arr[i].getLastName()+ " больше введенной " +
                            " и равна= "+arr[i].getSalary());
                }
            }
        }
    }


}
