/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematiksinifi;

/**
 *
 * @author ysfbil
 */
public class MyMath {

    public static double Mutlak(double x) {
        
        if (x < 0) {
            return x * -1;
        } else {
            return x;
        }
    }

    public static int Mutlak(int x) {
        if (x < 0) {
            return x * -1;
        } else {
            return x;
        }
    }

    public static byte ciftMi(int x) {
        if (x % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }

    private static int max2UsBul(double x) {
        int x_int = (int) x;
        int f = 0;

        while (x_int > 0) {
            x_int = (int) (x_int / 2);
            f++;
        }

        return f - 1;
    }

    public static double Ln(double x) {

        if (x < 1) {
            return LnK2(x);
        }
        //x sayısını a.2^b_max şeklinde 2'nin en büyük kuvveti ile ifade ediyoruz
        double ln2 = 0.69314718055994530941723212145818;
        int b = max2UsBul(x);
        double a = x / aUssu(2, b);
        double lna = LnK2(a);

        //ln(x)=ln(a.2^b)=ln(a)+b*ln(2) olacağından
        return lna + b * ln2;
    }

    private static double LnK2(double x) {
        //0.001 ile 2 arasındaki sayıların Ln değeri 
        //lna'yı hesaplıyoruz (x=0'da taylor 0.0001-2 arası sayılar için makul sonuç verir) 
        double lna = 0;
        for (int i = 1; i < 1000; i++) {
            lna += ciftMi(i + 1) * aUssu(-1 + x, i) / i;
        }

        return lna;
    }
    
    public static boolean tamSayiMi(double x)
    {
        int x_int = Mutlak((int) x);
        return (Mutlak(x) - x_int) == 0.0;
    }

    public static double eUssu(double x) {
        double e = 2.7182818284590452353602874713527;
        int x_int = Mutlak((int) x);

        //üs tamsayı durumu
        if (tamSayiMi(x)) {
            if (x > 0) {
                return aUssu(e, x_int); //üs poz tam sayı ise normal kuvvetini alıyor
            } else {
                return 1 / aUssu(e, x_int); //üst negatif ise tersini alıyoruz
            }
        }

        //üs 0 ile 2 arasında (doğrudan taylora uygun) durumu
        if (x <= 2 && x > 0) {
            return eUssuK2(x); //üs pozitif ve <=2 ise taylor serisinden cevap veriyoruz
        }
        
        //üs ondalıklı ve 0-2 aralığında değil durumu
        //e^x i e^b.lna'ya dönüştürüyoruz. b=x_int lna=x/b, a'yı buluyorz. e^x=b^a olur.
        int b=x_int;
        double lna = Mutlak(x) / b; 
        double a = eUssuK2(lna);
        if (x > 0) {
            return aUssu(a, b); //x pozitif
        } else {
            return 1 / aUssu(a, b); //x negatif ise tersini alıyoruz
        }
    }

    private static double eUssuK2(double x) {
        double sonuc = 0;
        for (int i = 0; i < 10; i++) {
            sonuc += aUssu(x, i) / faktoriyel(i);
        }

        return sonuc;
    }

    public static double aUssu(double a, int x) {
        double sonuc = 1;
        for (int i = 1; i <= x; i++) {
            sonuc *= a;
        }
        return sonuc;
    }

    public static double aUssu(double a, double x) {
        //  c=a^x  lnc=x.ln(a) dönüşümü yapıp c=e^lnc ile sonucu buluyoruz
        double lnc=x*Ln(a);
        return eUssu(lnc);
    }

    public static int faktoriyel(int n) {
        if (n == 1 | n == 0) {
            return 1;
        } else {
            return (n * faktoriyel(n - 1));
        }
    }

}
