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
        int sumSalary = sumSalary(person);//сумма затрат на зарплпты
        System.out.println("Сумма затрат на зарплаты в месяц составляет " + sumSalary);

        minmaxSalary(person);// вызов метода, определяющего минимальную зарплату
        //maxSalary(person);// вызов метода, определяющего максимальную зарплату
        middleSalary(sumSalary, person);// вызов метода, определяющего среднюю зарплату
        outputName(person);


    }

    static void outputConsole(Employee[] arr) {
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);

        }

    }

    static int sumSalary(Employee[] arr) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + arr[i].getSalary();
        }
        return sum;
        //System.out.println("Сумма затрат на зарплаты в месяц составляет " + sum);

    }

    static void minmaxSalary(Employee[] arr) {
        int min = 100000;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i].getSalary() < min) {
                min = arr[i].getSalary();

            }
            if (arr[i].getSalary() > max) {
                max = arr[i].getSalary();

            }
        }


          for (int j = 0; j < 10; j++) {
            if (arr[j].getSalary() == min) {
                System.out.println("Сотрудник с минимальной зарплатой равной " +
                        min + " является " + arr[j].getName());
            }

                if (arr[j].getSalary() == max) {
                        System.out.println("Сотрудник с максимальной зарплатой равной " +
                                max + " является " + arr[j].getName());
                    }

                }
            }




    //static void maxSalary(Employee[] arr) {
     //   int max = 0;
      //  for (int i = 0; i < 10; i++) {
      //      if (arr[i].getSalary() > max) {
        //        max = arr[i].getSalary();
      //
      //  }

      //  for (int j = 0; j < 10; j++) {
     //       if (arr[j].getSalary() == max) {
       //         System.out.println("Сотрудник с максимальной зарплатой равной " +
     //                   max + " является " + arr[j].getName());
      //      }

     //   }


    //}

    static void middleSalary(int sum, Employee[] arr) {
        int middleSalary = sum / (arr.length);
        System.out.println("Среднее значение зарплат равно " + middleSalary);
    }

    static void outputName(Employee[] arr) {
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i].getName());

        }
    }
}




