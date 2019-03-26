package ru.avalon.java.dev.j10.labs.commons;

public class Address{
    
    private String country;         // страна
    private String area;            // область
    private String city;            // город
    private String houseNumber;     // номер дома
    private String street;          // улица
    private int index;              // индекс
    private int apart;              // номер квартиры, если есть
    private int corp;               // корпус дома, если есть
    
    public String getCountry(){ return country; }
    public String getArea(){ return area; }
    public String getCity() { return city; }
    public String getStreet() { return street; }
    public String getHouseNumber () { return houseNumber; }
    public int getIndex () { return index; }
    public int getApart () { return apart; }
    public int getCorp () { return corp; }
    
    // без номера квартиры и корпуса
    public Address(String country, String area, String city, String street, String houseNumber, int index){
        this.country = country;
        this.area = area;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.index = index; 
        this.apart = 0;
        this.corp = 0;
    }
    
    // без номера корпуса
    public Address(String country, String area, String city, String street, String houseNumber, int index, int apart){
        this.country = country;
        this.area = area;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.index = index;
        this.apart = apart;
    }
    
    // полный адрес    
    public Address(String country, String area, String city, String street, int index,String houseNumber, int apart, int corp){
        this.country = country;
        this.area = area;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.index = index;
        this.apart = apart;
        this.corp = corp;
    }
    
    // без номера квартиры
    public Address(String country, String area, String city, String street, int index, String houseNumber, int corp){
        this.country = country;
        this.area = area;
        this.city = city;
        this.street = street;
        this.index = index;
        this.houseNumber = houseNumber;      
        this.apart = 0;
        this.corp = corp;
    }
    
    
    /*  TODO (Замечания №1)
        Реализовать перегрузку конструктора.
        Конструктор с меньшим количеством полей реализовать через конструктор
        с большим количеством, либо через конструктор с полным набором полей!
        Подсказка - this();
    */
}

/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */