/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sunu9;

/**
 *
 * @author ysfbil
 */

class DigerSinif{
    
}

class Employee
{
    static int lastId=0;
    private int empleyeeId;
    String firstName;
    String lastName;
    
    Employee(String name, String lastName){
        this.empleyeeId=++lastId;
        this.firstName=name;
        this.lastName=lastName;
    }
    
    //buradaki gibi equals yazmak oldukça zahmetli olabilir. Bunun yerine
    //hashcode metodu ile birlikte equals kullanmak daha kullanışlıdır.
    public boolean equals(Object o)
    {
        if (o==null) return false;
        if (!(o instanceof Employee)) return false;
        Employee other = (Employee) o;
       // if (this.empleyeeId!=other.empleyeeId) return false;
        if (!this.firstName.equals(other.firstName)) return false;
        if (!this.lastName.equals(other.lastName)) return false;
        return true;
    }
}

public class EqualsDeyimi {
    public static void main(String[] args) {
        Employee e1=new Employee("Yusuf","Bilgen");
        Employee e2=new Employee("Yusuf","Bilgen");
        Employee e3=new Employee("Ahmet Yasin","Bilgen");
        Employee e4=null;
        DigerSinif e5=new DigerSinif();
        
        System.out.println("e1?=e2 " + e1.equals(e2));
        System.out.println("e1?=e3 " + e1.equals(e3));
        System.out.println("e1?=e4 " + e1.equals(e4));
        System.out.println("e1?=e5 " + e1.equals(e5));
        
    }
}
