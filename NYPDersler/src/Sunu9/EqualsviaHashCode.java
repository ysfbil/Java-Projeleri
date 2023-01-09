/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sunu9;

import static Sunu9.Employee.lastId;

/**
 *
 * @author ysfbil
 */
class Employee2 {

    static int lastId2 = 0;
    protected int employeeId;
    protected String firstName, lastName;

    Employee2(String name, String lastName) {
        this.employeeId = ++lastId2;
        this.firstName = name;
        this.lastName = lastName;
    }

    public int hashCode() {
      
        return firstName.hashCode() * lastName.hashCode();
    }

    public boolean equals(Object obj) {
        Employee2 e = (Employee2) obj;
        return this.hashCode() == e.hashCode();
    }
}

public class EqualsviaHashCode {

    public static void main(String[] args) {
        Employee2 e1 = new Employee2("Yusuf", "Bilgen");
        Employee2 e2 = new Employee2("Yusuf", "Bilgen");
        Employee2 e3 = new Employee2("Ahmet Yasin", "Bilgen");
        

        System.out.println("e1?=e2 " + e1.equals(e2));
        System.out.println("e1?=e3 " + e1.equals(e3));
      

    }
}
