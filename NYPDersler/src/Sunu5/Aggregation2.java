/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sunu5;

/**
 *
 * @author ysfbil
 */
class Address {  
  String city,state,country;  
  
  public Address(String city, String state, String country) {  
    this.city = city;  
    this.state = state;  
    this.country = country;  
  }  
  
}  

class Emp {  
  int id;  
  String name;  
  Address address;  
  
  public Emp(int id, String name,Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
  }  
  
  void display(){  
    System.out.println(id+" "+name);  
    System.out.println(address.city+" "+address.state+" "+address.country);  
  }  
  
  public static void main(String[] args) {  
    Address address1=new Address("123","UP", "Siirt");  
    Address address2=new Address("345","UP", "Şırnak");  
  
    Emp e=new Emp(111, "Ahmet",address1);  
    Emp e2=new Emp(112, "Mehmet",address2); 
    e.display();  
    e2.display();        
  }  
}   
 


public class Aggregation2 {
    
}
