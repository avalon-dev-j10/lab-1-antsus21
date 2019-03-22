package ru.avalon.java.dev.j10.labs.models;

import java.time.LocalDate;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {
    
    private String series;      // серия
    private int numPas;         // номер
    private String name;        // имя
    private String surName;     // фамилия
    private String fatherName;  // отчество, если есть
    private String secName;     // второе имя, если есть
    private LocalDate birthday; // дата рождения
    private LocalDate date;     // дата выдачи паспорта
    private String org;         //орган, выдавший документ
    
    public String getSeries (){return series;}
    public int getNumPas (){return numPas;}
    public String getName (){return name;}
    public String getSurname (){return surName;}
    public String getFatherName (){return fatherName;}
    public String getSecName (){return secName;}
    public LocalDate getBirthday (){return birthday;}
    public LocalDate getDate (){return date;}
    public String getOrg (){return org;}
    
    // полный конструктор
    public Passport (String series, int numPas, String name, String surName, String fatherName, String secName, LocalDate birthday, LocalDate date, String org) {
        this.series = series;
        this.numPas = numPas;
        this.name = name;
        this.surName = surName;
        this.fatherName = fatherName;
        this.secName = secName;
        this.birthday = birthday;
        this.date = date;
        this.org = org;
    }
    // без отчества и второго имени
    public Passport (String series, int numPas, String name, String surName, LocalDate birthday, LocalDate date, String org) {
        this.series = series;
        this.numPas = numPas;
        this.name = name;
        this.surName = surName;
        this.fatherName = "";
        this.secName = "";
        this.birthday = birthday;
        this.date = date;
        this.org = org;
    }
    // без отчества
    public Passport (String series, int numPas, String name, String secName, String surName, LocalDate birthday, LocalDate date, String org) {
        this.series = series;
        this.numPas = numPas;
        this.name = name;
        this.secName = secName;
        this.surName = surName;
        this.fatherName = "";
        this.birthday = birthday;
        this.date = date;
        this.org = org;
    }
    // без второго имени
    public Passport (String series, int numPas, LocalDate date, String name,String fatherName, String surName, LocalDate birthday,  String org) {
        this.series = series;
        this.numPas = numPas;
        this.date = date;
        this.name = name;
        this.surName = surName;
        this.birthday = birthday;
        this.fatherName = fatherName;
        this.secName = "";
        this.org = org;
    }

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
}
