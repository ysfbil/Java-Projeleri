/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sunu10;

/**
 *
 * @author ysfbil
 */
class Age {

    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}

final class ImmutableStudent {

    private final int id;
    private final String name;
    private final Age age;

    public ImmutableStudent(int id, String name, Age age) {
        this.id = id;
        this.name = name;
        //  this.age=age; //bu şekilde yapılırsa referanslar aynı olur bu sebeple immutable özellik bozulur.
        Age cloneAge = new Age();
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        this.age = cloneAge;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Age getAge() {
        Age cloneAge = new Age(); //get metodlarında referans türü değişkenlerin clone döndürmesi gerekir
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        return cloneAge;
    }
}

public class ImmutableClass {

    public static void main(String[] args) {
        Age age = new Age();
        age.setDay(1);
        age.setMonth(1);
        age.setYear(1992);
        ImmutableStudent student = new ImmutableStudent(1, "Alex", age);
        System.out.println("Modifikasyon öncesi:" + student.getAge().getYear());
        age.setYear(2002); //eğer sınıf contr. clone yapılmazsa bu değişiklikten immutable sınıf etkilenir. (Bu sebeple immutable olmaz)
        //Çünkü nesnelerin referansları yani pointerları taşınır.
        System.out.println("Modifikasyon sonrası:" + student.getAge().getYear());

        //ancak halen immutable özellik tam olarak sağlanmadı
        student.getAge().setYear(999);
        System.out.println(student.getAge().getYear());
        //Bunu engellemek için getAge metodunun da orjinali değil clone döndürmesi gerekir.
    }
}
