import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // creatingList();// создание массива сотрудников: ФИО, зарплата, отдел

        Employee[] person = new Employee[10];

        person[0] = new Employee("Сотрудник1", 78000, 2);
        person[1] = new Employee("Сотрудник2", 24000, 3);
        person[2] = new Employee("Сотрудник3", 24500, 1);
        person[3] = new Employee("Сотрудник4", 34000, 4);
        person[4] = new Employee("Сотрудник5", 24000, 3);
        person[5] = new Employee("Сотрудник6", 51300, 5);
        person[6] = new Employee("Сотрудник7", 32000, 1);
        person[7] = new Employee("Сотрудник8", 54000, 4);
        person[8] = new Employee("Сотрудник9", 78000, 5);
        person[9] = new Employee("Сотрудник10", 45200, 4);
        person[3].setSalary(33000);//изменение зарплаты
        person[2].setDepartment(4);//изменение отдела

        outputConsole(person);//вывод в консоль всех данных о сотрудниках
        double sumSalary = sumSalary(person);//сумма затрат на зарплпты
        System.out.println("Сумма затрат на зарплаты в месяц составляет " + sumSalary);

        minSalary(person);// вызов метода, определяющего минимальную зарплату
        maxSalary(person);// вызов метода, определяющего максимальную зарплату
        middleSalary(sumSalary, person);// вызов метода, определяющего среднюю зарплату
        outputName(person);
        indexSalary(person, 10);//индексация зарплаты всех сотрудников
        minSalaryDepartment(person, 5);
        sumSalaryDepartment(person, 3);
        System.out.println("Сумма затрат на зарплаты в месяц в отделе составляет " + sumSalaryDepartment(person, 3));
        middleSalaryDepartment(person, 4);
        System.out.println("Средняя зарплата в отделе " + middleSalaryDepartment(person, 4));
        indexSalaryDepartment(person, 1,5);


    }

    static void outputConsole(Employee[] arr) {
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);

        }

    }

    static double sumSalary(Employee[] arr) {
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + arr[i].getSalary();
        }
        return sum;
        //System.out.println("Сумма затрат на зарплаты в месяц составляет " + sum);

    }

    static void minSalary(Employee[] arr) {
        double min = 100000;

        for (int i = 0; i < 10; i++) {
            if (arr[i].getSalary() < min) {
                min = arr[i].getSalary();

            }

        }


        for (int j = 0; j < 10; j++) {
            if (arr[j].getSalary() == min) {
                System.out.println("Сотрудник с минимальной зарплатой равной " +
                        min + " является " + arr[j].getName());
            }

        }
    }


    static void maxSalary(Employee[] arr) {
        double max = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i].getSalary() > max) {
                max = arr[i].getSalary();
            }
        }

        for (int j = 0; j < 10; j++) {
            if (arr[j].getSalary() == max) {
                System.out.println("Сотрудник с максимальной зарплатой равной " +
                        max + " является " + arr[j].getName());
            }

        }


    }

    static void middleSalary(double sum, Employee[] arr) {
        double middleSalary = sum / (arr.length);
        System.out.println("Среднее значение зарплат равно " + middleSalary);
    }

    static void outputName(Employee[] arr) {
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i].getName());

        }
    }

    //static void sigma (Employee []arr) {
    //  double sig = 0;
    //  for(Employee elt: arr){
    //      sig += elt.getSalary();
    //   }
    //   System.out.println("Суммочка " + sig);
    // }
    public static void indexSalary(Employee[] arr, int arg) {
        for (Employee emp : arr) {
            emp.setSalary((emp.getSalary() * (100 + arg)) / 100);

            System.out.println(emp.getName() + " зарплата увеличена на " + arg + "%, теперь она равна " + emp.getSalary());
        }
    }

    public static void minSalaryDepartment(Employee[] arr, int arg) {
        double min = 200_000;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getDepartment() == arg && arr[i].getSalary() < min) {
                min = arr[i].getSalary();
                k = i;
            }
        }

        System.out.println("В " + arg + " отделе сотрудником с минимальной зарплатой " + min + " является " + arr[k].getName());


    }

    public static void maxSalaryDepartment(Employee[] arr, int arg) {
        double max = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getDepartment() == arg && arr[i].getSalary() > max) {
                max = arr[i].getSalary();
                k = i;
            }
        }

        System.out.println("В " + arg + " отделе сотрудником с максимальной зарплатой " + max + " является " + arr[k].getName());


    }

    public static double sumSalaryDepartment(Employee[] arr, int arg) {
        double sum = 0;
        for (Employee employee : arr) {
            if (employee.getDepartment() == arg) {
                sum += employee.getSalary();
            }
        }
        return sum;

    }

    public static double middleSalaryDepartment(Employee[] arr, int arg) {
        int i = 0;
        for (Employee employee : arr) {
            if (employee.getDepartment() == arg) {
                i++;
            }
        }
        return sumSalaryDepartment(arr, arg) / i;
    }

    public static void indexSalaryDepartment(Employee[] arr,int dep, int arg) {
        for (Employee emp : arr) {
            if (emp.getDepartment() == dep) {

                emp.setSalary((emp.getSalary() * (100 + arg)) / 100);

                System.out.println(emp.getName() + " зарплата увеличена на " + arg + "%, теперь она равна " + emp.getSalary());
            }
        }
    }
}









