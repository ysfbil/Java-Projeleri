/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package cozumler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Process {

    private String id;
    private String courseName;
    private List<Student> students;

    public static Process getInstance() {

        return new Process();
    }

    private Process() {
        students = new ArrayList<>();
    }

    public Process setCourseId(String id) {
        this.id = id;
        return this;
    }

    public Process setCourseName(String courseName) {
        this.courseName = courseName;
        return this;
    }

    public Process setStudent(Student student) {

        students.add(student);
        return this;
    }

    @Override
    public String toString() {

        return "Process{id="+this.id+", courseName="+this.courseName+", students="+ students.toString()+"}";
    }

}

class Student {

    private String studentName;
    private String id;
    private int vize;
    private int Final;
    private float ort;
    private String durum;
    
        public static Student getInstance(String studentName, int vize, int Final) {
        Student ns = new Student();
        ns.studentName = studentName;
        ns.id = "595470";
        ns.vize = vize;
        ns.Final = Final;
        ns.ort = vize * 0.4f + Final * 0.6f;
        ns.durum = (ns.ort > 55) ? "Geçti" : "kaldı";

        return ns;
    }

    private Student() {

    }

    public static Student getInstance(String studentName, String id, int vize, int Final) {
        Student ns = new Student();
        ns.studentName = studentName;
        ns.id = id;
        ns.vize = vize;
        ns.Final = Final;
        ns.ort = vize * 0.4f + Final * 0.6f;
        ns.durum = (ns.ort > 55) ? "Geçti" : "kaldı";

        return ns;
    }

@Override
public String toString()
{
    return "{studentName="+this.studentName+", id="+this.id+", vize="+this.vize
            +", Final="+this.Final+", ort="+this.ort+", durum="+this.durum+"}\n";
}

}

/**
 *
 * @author ysfbil
 */
public class CourseManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
            Process p=Process.getInstance().setCourseId("BMH 303")
               .setCourseName("Java Programming Language")
               .setStudent(Student.getInstance("Mehmet Yaşar", "293478",95,100))
               .setStudent(Student.getInstance("Veysel Demir"  , 43, 55));
         
          System.out.println("Process Information = " + p);

        
    }
}
