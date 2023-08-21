import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        creatingList();// создание массива сотрудников: ФИО, зарплата, отдел
        outputConsole();//вывод в консоль всех данных о сотрудниках
    }
      static void creatingList() {

       Employee[] person = new Employee[10];
      //  for (int i = 0; i<10  ; i++) {
      //      Employee person[i] = Employee employee = new Employee();
      //                      }
       // Employee person[1] = Employee employee = new Employee();
        person[0] = new  Employee ("Сотрудник10",78000,2);
        person[1] = new Employee("Сотрудник1",24000,3 );
        person[2] =  new Employee ("Сотрудник2",24500,1 );
        person[3] =  new Employee ("Сотрудник3",34000,4 );
        person[4] = new Employee ("Сотрудник4",48000,3 );
        person[5] = new Employee ("Сотрудник5",51300,5 );
        person[6] = new Employee ("Сотрудник6",32000,1 );
        person[7] = new Employee ("Сотрудник7",54000,4 );
        person[8] = new Employee ("Сотрудник8",37000,5 );
        person[9] = new Employee ("Сотрудник9",45200,4 );

             //  System.out.println(person[5].getName());
          static String outputConsole() {
        for (int i = 0; i < 10 ; i++) {
           return; System.out.println(person[i]);
        }






    }

}