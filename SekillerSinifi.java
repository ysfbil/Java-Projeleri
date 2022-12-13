
class sekiller
{
    public String renk;
    
    public void ciz(){
        System.out.println("Şekil çizilecek");
        
    }
}

class cokgen extends sekiller
{
    public int kenarsayisi;
    
    public void ciz(){
        System.out.println("çokgen çizilecek");
    }
}

class elips extends sekiller{
    public int yaricap1;
    public int yaricap2;
    
     public void ciz(){
        System.out.println("elips çizilecek");
    }
}

class daire extends elips{
    daire(){
        yaricap2=yaricap1;
    }
    
    daire(int yaricap){
        yaricap1=yaricap;
        yaricap2=yaricap;
    }
    
     public void ciz(){
        System.out.println("elips çizilecek");
    }
}

class dikdortgen extends cokgen{
    dikdortgen(){
        kenarsayisi=4;
    }
    
    public void ciz(){
        System.out.println("dikdortgen çizilecek");
    }
}

class kare extends cokgen{
    kare(){
        kenarsayisi=4;
    }
    
    public void ciz(){
        System.out.println("kare çizilecek");
    }
}

class besgen extends cokgen{
    besgen(){
        kenarsayisi=3;
    }
    
    public void ciz(){
        System.out.println("beşgen çizilecek");
    }
}

class altigen extends cokgen{
    altigen(){
        kenarsayisi=6;
    }
    
    public void ciz(){
        System.out.println("altıgen çizilecek");
    }
}

public class Main
{
	public static void main(String[] args) {
		sekiller sekil1=new dikdortgen();
		sekil1.ciz();
	}
}
