import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // creatingList();// создание массива сотрудников: ФИО, зарплата, отдел

        Employee[] person = new Employee[10];

        person[0] = new Employee("Сотрудник1", 78000, 2);
        person[1] = new Employee("Сотрудник2", 24000, 3);
        person[2] = new Employee("Сотрудник3", 24500, 1);
        person[3] = new Employee("Сотрудник4", 34000, 4);
        person[4] = new Employee("Сотрудник5", 48000, 3);
        person[5] = new Employee("Сотрудник6", 51300, 5);
        person[6] = new Employee("Сотрудник7", 32000, 1);
        person[7] = new Employee("Сотрудник8", 54000, 4);
        person[8] = new Employee("Сотрудник9", 37000, 5);
        person[9] = new Employee("Сотрудник10", 45200, 4);
        outputConsole( person);//вывод в консоль всех данных о сотрудниках


        }

            static void outputConsole(Employee [] arr ) {
            for (int i = 0; i < 10; i++) {
                System.out.println(arr [i]);

            }
        }

    }

