/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sunu10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ysfbil
 */
class City implements Cloneable {

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Personel implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    int id;
    String ad;
    City city;

    Personel() {
        System.out.println("Yeni personel");
    }

    Personel(int id) {
        this.id = id;
        System.out.println("Paramtetreli conctructor prm1=" + id);
    }

    public Personel(Personel original) {  //copy constructor
        this.id = original.id + 1;
        this.ad = new String(original.ad);

    }

    public String getName() {
        System.out.println(this.ad);
        return this.ad;

    }

    public void setName(String ad) {
        this.ad = ad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personel other = (Personel) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.ad, other.ad);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + ((ad == null) ? 0 : ad.hashCode());
        return result;
    }

    public String toString() {
        return "Personel [ad=" + ad + ", id=" + id + "}";
    }

//    public Object clone() //shallow clone
//    {
//        Object obj=null;
//        try {
//            obj=super.clone();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return obj;
//            
//    }
    @Override //deep clone
    public Personel clone() {
        Personel cloneObj = null;

        try {
            cloneObj = (Personel) super.clone();
            cloneObj.city = (this.city==null)?null: (City) this.city.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Personel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cloneObj;
    }
}

public class Clonning {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException {
        //new ile
        Personel p1 = new Personel();

        //Class.newInstance ile: Bu parametresiz constructor?? ??a????r??r.
        Personel p2 = (Personel) Class.forName("Sunu10.Personel").newInstance();

        Personel p3 = Personel.class.newInstance();
        p3.setName("yusuf");

        //Constructor.newInstance ile nesne olu??turma: Bununla parametreli kullanmak m??mk??n, private const. ??a????rmak m??mk??n      
//        Constructor<Personel> c1=Personel.class.getConstructor();
//        Personel p4 = c1.newInstance();
//clone kullanarak: Bu ??ekilde nesne yapt??????m??zda const. ??a??r??lmaz. Bunu kullanamk i??in Cloneable implement edilmeli
// ve  clone metodu override edilmelidir.
        Personel p5 = (Personel) p3.clone();
        p5.getName();
        //deserilization kullanarak
        //bir nesneyi serialize ederek byte koda ??evirmemiz kaydedip daha sonra ayn?? nesneyi t??m ??zellikleri ile 
        //deserialize edip kullanmam??z m??mk??nd??r. Bu ??ekilde yapt??????m??zda jvm bir constr. ??al????t??rmaz
        //bu ??ekilde yeni nesne oluturmak da m??mk??nd??r.
        //Serialize etme
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));
        out.writeObject(p3);
        out.close();

        //Deserialze etme
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
        Personel p6 = (Personel) in.readObject();
        in.close();

        p6.getName();

        //new d??????ndaki t??m y??ntemlerde jvm invokevirtual komutunu ??al????t??r??r. new i??in ise invokespecial ??al??????r.
        //
    }
}
