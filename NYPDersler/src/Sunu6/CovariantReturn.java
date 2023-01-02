/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sunu6;

/**
 *
 * @author ysfbil
 */
public class CovariantReturn {
    
    int renkkodu=1;
    
    @Override
    public CovariantReturn clone()
    {
        CovariantReturn crnew=new CovariantReturn();
        crnew.renkkodu=this.renkkodu;
        return crnew;
    }
    
    public static void main(String[] args) {
        CovariantReturn cr=new CovariantReturn();
        cr.renkkodu=10;
        CovariantReturn cr2=cr.clone();
        System.out.println(cr2.renkkodu);
        //object sınıfının clone metodunu override ettik ve dönüşü cast yapmadan kendisınıf türümüzden yaptık.
    }
    
}
