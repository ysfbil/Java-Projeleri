/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usalma;

import java.util.Arrays;


/**
 *
 * @author ysfbil
 */
public class UsAlma {
    
    private static double E=2.718281828;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                double a=1.3;
                double b=2.8;
               System.out.println("usAl = " + usAl(a,b));
               System.out.println("Math.pow = " + Math.pow(a,b));  
//        System.out.println("ln(3.3) = " + lnNewton(3.3));
//        System.out.println("tamUstAl = " + tamUstAl(3,3.2)); 
//        System.out.println("ondalikliUs = " + ondalikliUs(3,0.3));
    
//        System.out.println("ondalıklı e üstü = " + ondEUs(0.94));
    }
    
      private static double usAl(double a, double b) {
        double bt,bo;
        bt=tam_ond(b)[0];
        bo=tam_ond(b)[1];
        bo=yuvarla(bo,2);
        double sonuc0=tamUstAl(a,bt);
        double sonuc1=  ondalikliUs(a, bo);
        
        return sonuc0*sonuc1;
       }
      
       private static double[] tam_ond(double a){
           double at=(int)a;
           double ao=a-at;
           return new double[]{at,ao};
       }
    
        
     public static double tamUstAl(double a, double b) {
        double sonuc = 1;
        for (int i = 1; i <= b; i++) {
            sonuc *= a;
        }
        return sonuc;
    }
   
      private static double ondalikliUs(double a, double bo) {
         double lna=lnNewton(a);
         double lnsonuc1=bo*lna;
         double ust=tam_ond(lnsonuc1)[0];
         double uso=tam_ond(lnsonuc1)[1];
         double eust=tamEUsAl(ust);
         double euso=ondEUs(uso);
         
          return eust*euso;
      }   
   

    private static double lnNewton(double a) {
        double Xn=1;
        double mFxMin=Double.MAX_VALUE;
        double lnSonuc1=1;
        
        for (int i=0;i<1000;i++)
        {
        double XnH=tam_ond(Xn)[0];
        double XnL=yuvarla(tam_ond(Xn)[1],2);
        double eXnH=tamEUsAl(XnH);
        double eXnL=ondEUs(XnL);
        double ecarpim=eXnH*eXnL;
        double fx=ecarpim-a;
        double mfx=mutlak(fx);
        double fx_trv=ecarpim;
        Xn=Xn-fx/fx_trv;
        
            
        if (mfx<mFxMin || mfx==0)
        {
            mFxMin=mfx;
            lnSonuc1=Xn;
        }
        }
        
        
        
        return lnSonuc1;
    }
    
     private static double tamEUsAl(double a) {
          return tamUstAl(E, a);
    }
     
     private static double yuvarla(double a,int duyarlilik) {
         double boyut = tamUstAl(10, duyarlilik);            
         return Math.round(a * boyut) / boyut;
      
     }
     
     static double[] degerler={0.0,0.1,0.11,0.12,0.13,0.14,0.15,0.16,0.17,0.18,0.19,0.2,0.21,0.22,0.23,0.24,0.25,0.26,0.27,0.28,0.29,0.3,0.31,0.32,0.33,0.34,0.35,0.36,0.37,0.38,0.39,0.4,0.41,0.42,0.43,0.44,0.45,0.46,0.47,0.48,0.49,0.5,0.51,0.52,0.53,0.54,0.55,0.56,0.57,0.58,0.59,0.6,0.61,0.62,0.63,0.64,0.65,0.66,0.67,0.68,0.69,0.7,0.71,0.72,0.73,0.74,0.75,0.76,0.77,0.78,0.79,0.8,0.81,0.82,0.83,0.84,0.85,0.86,0.87,0.88,0.89,0.9,0.91,0.92,0.93,0.94,0.95,0.96,0.97,0.98,0.99};
     static double[] eOfDegerler={1,1.105170918,1.11627807,1.127496852,1.138828383,1.150273799,1.161834243,1.173510871,1.185304851,1.197217363,1.209249598,1.221402758,1.23367806,1.246076731,1.25860001,1.27124915,1.284025417,1.296930087,1.309964451,1.323129812,1.336427488,1.349858808,1.363425114,1.377127764,1.390968128,1.404947591,1.419067549,1.433329415,1.447734615,1.462284589,1.476980794,1.491824698,1.506817785,1.521961556,1.537257524,1.552707219,1.568312185,1.584073985,1.599994193,1.616074402,1.63231622,1.648721271,1.665291195,1.68202765,1.698932309,1.716006862,1.733253018,1.7506725,1.768267051,1.786038431,1.803988415,1.8221188,1.840431399,1.858928042,1.877610579,1.896480879,1.915540829,1.934792334,1.954237321,1.973877732,1.993715533,2.013752707,2.033991259,2.054433211,2.075080608,2.095935514,2.117000017,2.13827622,2.159766254,2.181472265,2.203396426,2.225540928,2.247907987,2.270499838,2.29331874,2.316366977,2.339646852,2.363160694,2.386910854,2.410899706,2.435129651,2.459603111,2.484322533,2.50929039,2.534509178,2.559981418,2.585709659,2.611696473,2.637944459,2.664456242,2.691234472};
      
     private static double ondEUs(double a)
     {
         double ao=yuvarla(a,2);
         int indis=Arrays.binarySearch(degerler, ao);    
         
         if (indis<0) return 1;
         
         return eOfDegerler[indis];
     }
     
      private static double mutlak(double a){
          if (a<0)
              return -1*a;
          else
              return a;
      }
     
    
     

  

  
    
}
