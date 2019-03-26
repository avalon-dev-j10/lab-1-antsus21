package ru.avalon.java.dev.j10.labs;

import java.time.LocalDate;
import java.time.Month;
import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;

public class Main {

    public static void main(String[] args) {
        
    
 

        /*
         * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
         */

        Person ivanov = null;
        Person smith = null;

        
        ivanov = new Person( new Passport("3245", 345657, 
                                         "Иван","Иванович","Gfr",LocalDate.of(1982, 6, 21),LocalDate.of(1990, Month.MARCH, 24),"Выдан организацией..."),
                             new Address("Россия","Ленинградская обл.","Санкт-Петербург","ул. А. Невского","дом 88",123677));
        
        smith = new Person( new Passport("", 23132,"John","Edvard","Smith",LocalDate.of(1965, 11, 11), LocalDate.of(1983, 12, 23),"LAPD"),
                            new Address("USA","CALIFORNIA","Los Angeles","Green Street",883667,"78",1267));
        
        System.out.println("------------------------------------------------------------------------------------");       
        System.out.println(ivanov.getFullName());   
        System.out.println(ivanov.getAddress());
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(smith.getFullName());
        System.out.println(smith.getAddress());
        System.out.println("------------------------------------------------------------------------------------");
        
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
