package ru.avalon.java.dev.j10.labs.commons;

public class Address{
    
    private int index;              // индекс, если есть
    private String country;         // страна
    private String area;            // область
    private String city;            // город
    private String street;          // улица  
    private String houseNumber;     // номер дома
    private int apart;              // номер квартиры
    private int corp;               // корпус дома, если есть
    
    public int getIndex () { return index; }
    public String getCountry(){ return country; }
    public String getArea(){ return area; }
    public String getCity() { return city; }
    public String getStreet() { return street; }
    public String getHouseNumber () { return houseNumber; }
    public int getApart () { return apart; }
    public int getCorp () { return corp; }
    
    // без индекса и корпуса
    public Address(String country, String area, String city, String street, String houseNumber, int apart){
        this(0, country, area, city, street, houseNumber, apart, 0);        
    }
    
    // без номера корпуса
    public Address(int index, String country, String area, String city, String street, String houseNumber, int apart){
        this(index, country, area, city, street, houseNumber, apart, 0);
    }
    
   // без индекса
    public Address(String country, String area, String city, String street, String houseNumber, int apart, int corp){
    this(0, country, area, city, street, houseNumber, apart, corp);
   }
    
    // полный адрес    
    public Address(int index, String country, String area, String city, String street, String houseNumber, int apart, int corp){
        this.index = index;
        this.country = country;
        this.area = area;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apart = apart;
        this.corp = corp;
    }
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